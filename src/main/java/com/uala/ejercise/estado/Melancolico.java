package com.uala.ejercise.estado;

import com.uala.ejercise.contenido.Contenido;

import java.util.List;

public class Melancolico implements Estado {

    @Override
    public List<Contenido> sugerenciaPorEstado() {
        return this.buscarPeliculasEstranadasHaceMasDe10Anios();
    }

    private List<Contenido> buscarPeliculasEstranadasHaceMasDe10Anios() {
        return null;
    }
}
