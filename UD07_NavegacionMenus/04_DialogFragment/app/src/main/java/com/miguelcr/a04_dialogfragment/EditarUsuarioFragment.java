package com.miguelcr.a04_dialogfragment;


import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class EditarUsuarioFragment extends DialogFragment {
    private static final String ARG_ID_USUARIO = "id_usuario";

    // TODO: Rename and change types of parameters
    private int idUsuarioEditar;
    private EditText etNombre, etPass;


    public EditarUsuarioFragment() {
        // Required empty public constructor
    }

    public static EditarUsuarioFragment newInstance(int idUsuario) {
        EditarUsuarioFragment fragment = new EditarUsuarioFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_ID_USUARIO, idUsuario);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            idUsuarioEditar = getArguments().getInt(ARG_ID_USUARIO);
        }
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Editar usuario");
        builder.setMessage("Edite los datos del usuario")
                .setPositiveButton("Guardar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // FIRE ZE MISSILES!
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                });

        // Las siguientes 2 líneas de código cargan en el diálogo
        // la vista personalizada
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View v = inflater.inflate(R.layout.fragment_editar_usuario, null);

        etNombre = v.findViewById(R.id.editTextNombre);
        etPass = v.findViewById(R.id.editTextPass);

        // Llamaría a Retrofit con el idUsuario que he recibido
        // y en el método onResponse de Retrofit tendría que poner
        // todas las líneas de código que vienen a continuación

        etNombre.setText("Miguel");
        etPass.setText("1234");

        builder.setView(v);

        // Create the AlertDialog object and return it
        return builder.create();
    }


}
