package com.miguelcr.a02_listviewcustom;

class Alumno {
    private String nombre;
    private int edad;
    private String photo;
    private String clase;

    public Alumno(String nombre, int edad, String photo, String clase) {
        this.nombre = nombre;
        this.edad = edad;
        this.photo = photo;
        this.clase = clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
}
