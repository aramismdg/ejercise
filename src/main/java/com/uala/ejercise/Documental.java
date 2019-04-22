package com.uala.ejercise;

public class Documental extends Contenido {
    @Override
    public boolean esInteresante() {
        return this.getTitulo().contains("unofficial");
    }
}
