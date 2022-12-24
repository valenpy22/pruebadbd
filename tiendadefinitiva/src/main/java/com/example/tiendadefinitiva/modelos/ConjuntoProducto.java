package com.example.tiendadefinitiva.modelos;

/**
 * LISTO
 * */
public class ConjuntoProducto {
    private int idconjuntoproducto; //PK
    private int idcategoriaproducto; //FK
    private String nombreconjuntoproducto;


    public ConjuntoProducto(int idconjuntoproducto, int idcategoriaproducto, String nombreconjuntoproducto) {
        this.idconjuntoproducto = idconjuntoproducto;
        this.idcategoriaproducto = idcategoriaproducto;
        this.nombreconjuntoproducto = nombreconjuntoproducto;
    }

    public int getIdconjuntoproducto() {
        return this.idconjuntoproducto;
    }

    public void setIdconjuntoproducto(int idconjuntoproducto) {
        this.idconjuntoproducto = idconjuntoproducto;
    }

    public int getIdcategoriaproducto() {
        return this.idcategoriaproducto;
    }

    public void setIdcategoriaproducto(int idcategoriaproducto) {
        this.idcategoriaproducto = idcategoriaproducto;
    }

    public String getNombreconjuntoproducto() {
        return this.nombreconjuntoproducto;
    }

    public void setNombreconjuntoproducto(String nombreconjuntoproducto) {
        this.nombreconjuntoproducto = nombreconjuntoproducto;
    }
}
