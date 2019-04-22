package com.uala.ejercise.subscripcion;

import java.math.BigDecimal;

public class Platinum extends Subscripicion {
    @Override
    public BigDecimal getCosto() {
        return BigDecimal.valueOf(300);
    }

    @Override
    public Integer getCantidadConexionesPermitidas() {
        return 5;
    }
}
