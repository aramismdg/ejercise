package com.uala.ejercise;

import java.math.BigDecimal;

public class Classic extends Subscripicion {
    @Override
    public BigDecimal getCosto() {
        return BigDecimal.valueOf(100);
    }

    @Override
    public Integer getCantidadConexionesPermitidas() {
        return 1;
    }
}
