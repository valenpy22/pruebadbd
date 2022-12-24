package com.example.tiendadefinitiva.modelos; // listo

/**
 * LISTO
 * */

public class MetodoDePago {
    private int idmetododepago;
    private String nombremetododepago;

    public MetodoDePago(int idmetododepago, String nombremetododepago) {
        this.idmetododepago = idmetododepago;
        this.nombremetododepago = nombremetododepago;
    }

    public int getIdmetododepago() {
        return this.idmetododepago;
    }

    public void setIdmetododepago(int idmetododepago) {
        this.idmetododepago = idmetododepago;
    }

    public String getNombremetododepago() {
        return this.nombremetododepago;
    }

    public void setNombremetododepago(String nombremetododepago) {
        this.nombremetododepago = nombremetododepago;
    }
}
