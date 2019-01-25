package com.miguelcr.a02_listviewcustom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    List<Alumno> alumnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.listViewAlumnos);

        alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Pepe", 18, "https://s3.amazonaws.com/uifaces/faces/twitter/jsa/128.jpg", "2º DAM"));
        alumnos.add(new Alumno("Carlos", 20, "https://s3.amazonaws.com/uifaces/faces/twitter/ritu/128.jpg", "2º DAM"));
        alumnos.add(new Alumno("José Antonio", 21, "https://s3.amazonaws.com/uifaces/faces/twitter/mattsince87/128.jpg", "2º DAM"));
        alumnos.add(new Alumno("Alejandro", 22, "https://s3.amazonaws.com/uifaces/faces/twitter/andyvitale/128.jpg", "2º DAM"));
        alumnos.add(new Alumno("Pepe", 18, "https://s3.amazonaws.com/uifaces/faces/twitter/jsa/128.jpg", "2º DAM"));
        alumnos.add(new Alumno("Carlos", 20, "https://s3.amazonaws.com/uifaces/faces/twitter/ritu/128.jpg", "2º DAM"));
        alumnos.add(new Alumno("José Antonio", 21, "https://s3.amazonaws.com/uifaces/faces/twitter/mattsince87/128.jpg", "2º DAM"));
        alumnos.add(new Alumno("Alejandro", 22, "https://s3.amazonaws.com/uifaces/faces/twitter/andyvitale/128.jpg", "2º DAM"));

        AlumnosAdapter adapterAlumnos = new AlumnosAdapter(
                this,
                R.layout.alumnos_item,
                alumnos
        );

        lista.setAdapter(adapterAlumnos);

    }
}
