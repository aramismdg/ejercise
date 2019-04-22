package com.uala.ejercise;

import java.util.List;

public class Triste implements Estado {
    @Override
    public List<Contenido> sugerenciaPorEstado() {
        return this.buscarPeliculasMayorADosHoras();
    }

    private List<Contenido> buscarPeliculasMayorADosHoras() {
        return null;
    }

}
