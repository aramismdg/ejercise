package com.uala.ejercise.metodoPago;

import java.math.BigDecimal;

public class Paypal extends MetodoPago {
    @Override
    public BigDecimal getCalculoInteres(BigDecimal monto) {
        return monto.multiply(BigDecimal.valueOf(0.98));
    }
}
