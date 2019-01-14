package com.miguelcr.a03_formulario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnRegistro;
    RadioGroup rgSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRegistro = findViewById(R.id.buttonRegistro);
        btnRegistro.setOnClickListener(this);

        rgSexo = findViewById(R.id.radioGroupSexo);
    }

    public void sexoSeleccionado(View view) {
        int id = view.getId();
        mostrarMensaje(id);
    }

    @Override
    public void onClick(View v) {
        int id = rgSexo.getCheckedRadioButtonId();
        mostrarMensaje(id);
    }

    public void mostrarMensaje(int idSeleccionado) {
        String seleccionado = "";

        switch (idSeleccionado) {
            case R.id.radioButtonH: seleccionado = "hombre"; break;
            case R.id.radioButtonM: seleccionado = "mujer"; break;
            case R.id.radioButtonI: seleccionado = "informático"; break;
        }

        Toast.makeText(
                this,
                "Sexo: " + seleccionado,
                Toast.LENGTH_LONG
        ).show();
    }
}
