package com.uala.ejercise.contenido;

public class Serie extends Contenido {

    private Integer cantidadTemporadas;
    @Override
    public boolean esInteresante() {
        return cantidadTemporadas == 4 || cantidadTemporadas == 5;
    }

    public void setCantidadTemporadas(Integer cantidadTemporadas) {
        this.cantidadTemporadas = cantidadTemporadas;
    }
}
