package com.example.tiendadefinitiva.modelos;

/**
 * LISTO
 * */

public class Rol {
    private int idrol;
    private String nombrerol;

    public Rol(int idrol, String nombrerol) {
        this.idrol = idrol;
        this.nombrerol = nombrerol;
    }

    public int getIdRol() {
        return this.idrol;
    }

    public void setIdRol(int idRol) {
        this.idrol = idRol;
    }

    public String getNombrerol() {
        return this.nombrerol;
    }

    public void setNombrerol(String nombrerol) {
        this.nombrerol = nombrerol;
    }
}
