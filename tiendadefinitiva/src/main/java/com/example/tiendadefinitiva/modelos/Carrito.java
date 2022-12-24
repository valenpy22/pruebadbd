package com.example.tiendadefinitiva.modelos;

import java.util.Date;

/***
 * LISTO
 * */

public class Carrito {
    private int idcarrito;
    private Date fechacompra;
    private int costocompra;
    private int idusuario;
    private int idmetododepago;

    public Carrito(int idcarrito, int idusuario, int metododepago, Date fechacompra, int costocompra) {
        this.idcarrito = idcarrito;
        this.idusuario = idusuario;
        this.idmetododepago = idmetododepago;
        this.fechacompra = fechacompra;
        this.costocompra = costocompra;
    }

    public int getIdcarrito() {
        return this.idcarrito;
    }

    public void setIdcarrito(int idcarrito) {
        this.idcarrito = idcarrito;
    }

    public int getIdusuario() {
        return this.idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdmetododepago() {
        return this.idmetododepago;
    }

    public void setIdmetododepago(int idmetododepago) {
        this.idmetododepago = idmetododepago;
    }

    public Date getFechacompra() {
        return this.fechacompra;
    }

    public void setFechacompra(Date fechacompra) {
        this.fechacompra = fechacompra;
    }

    public int getCostocompra() {
        return this.costocompra;
    }

    public void setCostocompra(int costocompra) {
        this.costocompra = costocompra;
    }
}
