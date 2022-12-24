package com.example.tiendadefinitiva.modelos;

/**
 * LISTO
 * */

public class Permiso {
    private int idpermiso;
    private int idrol;
    private int idaccion;

    public Permiso(int idpermiso, int idrol, int idaccion) {
        this.idpermiso = idpermiso;
        this.idrol = idrol;
        this.idaccion = idaccion;
    }

    public int getIdpermiso() {
        return this.idpermiso;
    }

    public void setIdpermiso(int idpermiso) {
        this.idpermiso = idpermiso;
    }

    public int getRol() {
        return this.idrol;
    }

    public void setRol(int idrol) {
        this.idrol = idrol;
    }

    public int getAccion() {
        return this.idaccion;
    }

    public void setAccion(int idaccion) {
        this.idaccion = idaccion;
    }
}
