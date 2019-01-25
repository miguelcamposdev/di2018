package com.miguelcr.a02_listviewcustom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

class AlumnosAdapter extends ArrayAdapter<Alumno> {
    Context ctx;
    int layout;
    List<Alumno> values;

    public AlumnosAdapter(Context context,
                          int resource,
                          List<Alumno> objects) {
        super(context, resource, objects);
        this.ctx = context;
        this.layout = resource;
        this.values = objects;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(ctx).inflate(layout, parent, false);

        // Obtenemos los datos del alumno actual
        Alumno actual = values.get(position);
        String name = actual.getNombre();
        String photo = actual.getPhoto();
        int age = actual.getEdad();
        String classroom = actual.getClase();

        // Obtener una referencia a los View components
        ImageView ivPhoto = v.findViewById(R.id.imageViewPhoto);
        TextView tvNombre = v.findViewById(R.id.textViewNombre);
        TextView tvInfo = v.findViewById(R.id.textViewInfo);

        // We set the student data into the view components
        tvNombre.setText(name);
        tvInfo.setText(String.valueOf(age) + "años, " + classroom);

        Glide.with(ctx).load(photo).into(ivPhoto);
        return v;
    }
}
