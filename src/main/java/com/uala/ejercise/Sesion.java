package com.uala.ejercise;

public class Sesion {
    private Integer nroCuenta;
    private Integer conexiones;

    public Sesion(Integer nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public Integer getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(Integer nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public Integer getConexiones() {
        return conexiones;
    }

    public void addConexion() {
        this.conexiones++;
    }
}
