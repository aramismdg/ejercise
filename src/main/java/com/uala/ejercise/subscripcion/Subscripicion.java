package com.uala.ejercise.subscripcion;

import java.math.BigDecimal;

public abstract class Subscripicion {

    private Integer nroCuenta;

    public abstract BigDecimal getCosto();

    public abstract Integer getCantidadConexionesPermitidas();

    public Integer getNroCuenta() {
        return nroCuenta;
    }
}
