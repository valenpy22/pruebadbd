package com.example.tiendadefinitiva.modelos;

/***
 * LISTO
 * */

public class CategoriaEmpresa {

    private int idcategoriaempresa;

    private int idcategoriaproducto;

    private int idempresa;

    public CategoriaEmpresa(int idcategoriaempresa, int idempresa, int idcategoriaproducto) {
        this.idcategoriaempresa = idcategoriaempresa;
        this.idempresa = idempresa;
        this.idempresa = idempresa;
    }

    public int getIdcategoriaempresa() {
        return this.idcategoriaempresa;
    }

    public void setIdcategoriaempresa(int idcategoriaempresa) {
        this.idcategoriaempresa = idcategoriaempresa;
    }

    public int getIdEmpresa() {
        return this.idempresa;
    }

    public void setIdEmpresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public int getIdcategoriaProducto() {
        return this.idcategoriaproducto;
    }

    public void setIdCategoriaProducto(int idcategoriaproducto) {
        this.idcategoriaproducto = idcategoriaproducto;
    }
}
