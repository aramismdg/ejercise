package com.uala.ejercise;

import java.math.BigDecimal;
import java.util.Date;

public class CobroBuilder {
    private final Usuario usuario;
    public BigDecimal getTotal;
    private BigDecimal monto;

    public CobroBuilder(Usuario usuario) {
        this.usuario = usuario;
    }

    public CobroBuilder costoPorSubscripcion() {
        this.monto = this.usuario.getSubscripicion().getCosto();
        return this;
    }


    public CobroBuilder metodoPago() {
        this.monto = this.usuario.getMetodoPago().getCalculoInteres(monto);
        return this;
    }

    public CobroBuilder evaluacionAntiguedad() {
        Date fechaRegistro = this.usuario.getFechaRegistro();
        Date fechaHoy = new Date();

        int dias=(int) ((fechaHoy.getTime()-fechaRegistro.getTime())/86400000);

        monto =  dias > 365 ? monto.multiply(BigDecimal.valueOf(0.97))  : monto;

        return this;

    }

    public BigDecimal getTotal() {
        return monto;
    }
}
