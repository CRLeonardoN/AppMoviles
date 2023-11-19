package com.example.tarea4;

public class listclases {
    public String color;
    public String clase;
    public String docente;

    public listclases(String color, String clase, String docente) {
        this.color = color;
        this.clase = clase;
        this.docente = docente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }
}