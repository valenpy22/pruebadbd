package com.example.tiendadefinitiva.modelos;

/**
 * LISTO
 * */

public class ProductoEmpresa {
    private int idproductoempresa;
    private int idempresa;
    private int idconjuntoProducto;
    private String nombreproducto;
    private int precio;
    private int stock;
    private int cantidadvendida;
    private String enlace;

    public ProductoEmpresa(int idproductoempresa, int idempresa, int idconjuntoProducto, String nombreproducto,
                           int precio, int stock, int cantidadvendida, String enlace) {
        this.idproductoempresa = idproductoempresa;
        this.idempresa = idempresa;
        this.idconjuntoProducto = idconjuntoProducto;
        this.nombreproducto = nombreproducto;
        this.precio = precio;
        this.stock = stock;
        this.cantidadvendida = cantidadvendida;
        this.enlace = enlace;
    }

    public int getIdproductoempresa() {
        return idproductoempresa;
    }

    public void setIdproductoempresa(int idproductoempresa) {
        this.idproductoempresa = idproductoempresa;
    }

    public int getIdempresa() {
        return this.idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public int getIdconjuntoproducto() {
        return this.idconjuntoProducto;
    }

    public void setIdconjuntoproducto(int idconjuntoProducto) {
        this.idconjuntoProducto = idconjuntoProducto;
    }

    public String getNombreproducto() {
        return this.nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCantidadvendida() {
        return this.cantidadvendida;
    }

    public void setCantidadvendida(int cantidadvendida) {
        this.cantidadvendida = cantidadvendida;
    }

    public String getEnlace() {
        return this.enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }
}
