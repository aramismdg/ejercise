package com.uala.ejercise.contenido;

public class Documental extends Contenido {
    @Override
    public boolean esInteresante() {
        return this.getTitulo().contains("unofficial");
    }
}
