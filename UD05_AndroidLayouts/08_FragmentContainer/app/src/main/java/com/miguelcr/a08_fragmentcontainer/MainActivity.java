package com.miguelcr.a08_fragmentcontainer;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCambio;
    boolean cargarAzul = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCambio = findViewById(R.id.buttonCambioFragment);


        // Por defecto cargo en el FrameLayout con el id R.id.contenedor
        // el fragmento de tipo RedFragment
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.contenedor, new RedFragment())
                .commit();

        // Evento click del botón
        btnCambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = null;

                if(cargarAzul) {
                    f = new BlueFragment();
                    btnCambio.setText(getString(R.string.load_red));
                } else {
                    f = new RedFragment();
                    btnCambio.setText(getString(R.string.load_blue));
                }

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contenedor, f)
                        .commit();

                cargarAzul = !cargarAzul;
            }
        });

    }
}
