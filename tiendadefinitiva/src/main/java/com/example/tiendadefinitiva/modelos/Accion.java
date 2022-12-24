package com.example.tiendadefinitiva.modelos; // listo

/***
 * LISTO
 * */

public class Accion {
    private int idaccion;
    private String descripcion;

    public Accion(int idaccion, String descripcion) {
        this.idaccion = idaccion;
        this.descripcion = descripcion;
    }

    public int getIdaccion() {
        return this.idaccion;
    }

    public void setIdaccion(int idaccion) {
        this.idaccion = idaccion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
