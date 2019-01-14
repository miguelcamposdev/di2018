package com.miguelcr.a04_spinnerdesplegable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerStarWars;
    ImageView ivStarWars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerStarWars = findViewById(R.id.spinnerPersonajes);
        ivStarWars = findViewById(R.id.imageViewStarWars);

        // Usamos un adaptador para cargar en el Spinner los elemenots
        //
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.starwars_objects,
                android.R.layout.simple_spinner_item
        );

    }
}
