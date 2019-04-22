package com.uala.ejercise.subscripcion;

import java.math.BigDecimal;

public class Gold extends Subscripicion {
    @Override
    public BigDecimal getCosto() {
        return BigDecimal.valueOf(200);
    }

    @Override
    public Integer getCantidadConexionesPermitidas() {
        return 3;
    }
}
