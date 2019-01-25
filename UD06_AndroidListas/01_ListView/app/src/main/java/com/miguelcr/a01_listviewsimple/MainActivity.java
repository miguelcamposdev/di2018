package com.miguelcr.a01_listviewsimple;

import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    List<String> alumnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Obtenemos referencia al ListView del layout
        lista = findViewById(R.id.listViewAlumnos);

        // 2. Lista de elementos (alumnos)
        alumnos = new ArrayList<>();
        alumnos.add("José Luis (alias Pein)");
        alumnos.add("Carlos II");
        alumnos.add("Mario C.");
        alumnos.add("Rubén");
        alumnos.add("Gonzalo");
        alumnos.add("Pepe Soria");
        alumnos.add("...");

        // 3. Conectar la lista de elementos a un adaptador

        ArrayAdapter adaptadorAlumnos = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                alumnos
        );

        // 4. Asociamos el adapter al nuestro ListView
        lista.setAdapter(adaptadorAlumnos);
    }
}
