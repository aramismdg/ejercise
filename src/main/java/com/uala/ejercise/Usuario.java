package com.uala.ejercise;

import java.util.Date;

public class Usuario {

    private Subscripicion subscripicion;
    private MetodoPago metodoPago;
    private Estado estado;
    private Contenido contenido;
    private Sesion sesion;
    private Date fechaRegistro;

    public Subscripicion getSubscripicion() {
        return subscripicion;
    }

    public void setSubscripicion(Subscripicion subscripicion) {
        this.subscripicion = subscripicion;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Contenido queMiras(Usuario usuario) {
        return this.contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    public Sesion getSesion() {
        return sesion;
    }

    public void setSesion(Sesion sesion) {
        this.sesion = sesion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
