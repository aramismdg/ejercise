package com.uala.ejercise;

import java.util.List;

public class Contento implements Estado {
    @Override
    public List<Contenido> sugerenciaPorEstado() {
        return this.buscarCualquierPelicula();
    }

    private List<Contenido> buscarCualquierPelicula() {
        return null;
    }
}
