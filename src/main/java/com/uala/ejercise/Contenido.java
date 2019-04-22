package com.uala.ejercise;

public abstract class Contenido {

    private String titulo;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract boolean esInteresante();
}
