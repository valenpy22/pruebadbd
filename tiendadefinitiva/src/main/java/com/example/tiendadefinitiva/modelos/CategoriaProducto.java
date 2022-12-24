package com.example.tiendadefinitiva.modelos;

/***
 * LISTO
 * */

public class CategoriaProducto {
    private int idcategoriaproducto;
    private String nombreproducto;

    public CategoriaProducto(int idcategoriaproducto, String nombreproducto) {
        this.idcategoriaproducto = idcategoriaproducto;
        this.nombreproducto = nombreproducto;
    }

    public int getIdcategoriaproducto() {
        return this.idcategoriaproducto;
    }

    public void setIdcategoriaproducto(int idcategoriaproducto) {
        this.idcategoriaproducto = idcategoriaproducto;
    }

    public String getNombreproducto() {
        return this.nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }
}
