package com.uala.ejercise.contenido;

public class Pelicula extends Contenido {

    private Integer cantidadOscar;

    @Override
    public boolean esInteresante() {
        return this.cantidadOscar > 1;
    }

    public void setCantidadOscar(Integer cantidadOscar) {
        this.cantidadOscar = cantidadOscar;
    }
}
