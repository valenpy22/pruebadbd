package com.example.tiendadefinitiva.modelos;

/***
 * LISTO
 * */

public class Compra {
    private int idcompra;
    private int cantidadcompra;

    private int idproductoempresa;

    private int idcarrito;

    private int idempresa;

    public Compra(int idcompra, int idproductoempresa, int idcarrito, int idempresa, int cantidadcompra) {
        this.idcompra = idcompra;
        this.idproductoempresa = idproductoempresa;
        this.idcarrito = idcarrito;
        this.idempresa = idempresa;
        this.cantidadcompra = cantidadcompra;
    }

    public int getIdcompra() {
        return this.idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public int getIdproductoempresa() {
        return this.idproductoempresa;
    }

    public void setIdproductoempresa(int idproductoempresa) {
        this.idproductoempresa = idproductoempresa;
    }

    public int getIdcarrito() {
        return this.idcarrito;
    }

    public void setIdcarrito(int idcarrito) {
        this.idcarrito = idcarrito;
    }

    public int getIdempresa() {
        return this.idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public int getCantidadcompra() {
        return this.cantidadcompra;
    }

    public void setCantidadcompra(int cantidadcompra) {
        this.cantidadcompra = cantidadcompra;
    }
}
