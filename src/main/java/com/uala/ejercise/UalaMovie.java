package com.uala.ejercise;

import com.uala.ejercise.cobro.CobroBuilder;
import com.uala.ejercise.contenido.Contenido;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UalaMovie {

    Map<Integer, Sesion> sesiones;

    public UalaMovie(){
        this.sesiones = new HashMap<>();
    }

    public boolean mirandoInteresante(Usuario usuario){
        Contenido contenido = usuario.queMiras(usuario);
        boolean isInteresante = contenido.esInteresante();

        return isInteresante;
    }

    public BigDecimal efectuarCobro(Usuario usuario){
        return new CobroBuilder(usuario)
                .costoPorSubscripcion()
                .metodoPago()
                .evaluacionAntiguedad()
                .getTotal();
    }

    public boolean acceder(Usuario usuario){
        Integer cantidadConexionesPermitidas = usuario.getSubscripicion().getCantidadConexionesPermitidas();

        Integer nroCuenta = usuario.getSubscripicion().getNroCuenta();

        if (!sesiones.containsKey(nroCuenta))
            sesiones.put(nroCuenta, new Sesion(nroCuenta));

        Sesion sesion = sesiones.get(nroCuenta);

        if (cantidadConexionesPermitidas > sesion.getConexiones()){
            sesion.addConexion();
            return true;
        }
        else
            return false;
    }

    public List<Contenido> sugerencia(Usuario usuario){
        return usuario.getEstado().sugerenciaPorEstado();
    }
}
