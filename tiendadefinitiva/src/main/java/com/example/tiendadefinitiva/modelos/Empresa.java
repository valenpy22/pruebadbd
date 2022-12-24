package com.example.tiendadefinitiva.modelos;


public class Empresa {
    private int idempresa;
    private int idusuario;
    private String nombreempresa;
    private String ubicaciongeografica;
    private int restriccion;
    private int ganancias;

    public Empresa(int idempresa, int idusuario, String nombreempresa, String ubicaciongeografica,
                   int restriccion, int ganancias) {
        this.idempresa = idempresa;
        this.idusuario = idusuario;
        this.nombreempresa = nombreempresa;
        this.ubicaciongeografica = ubicaciongeografica;
        this.restriccion = restriccion;
        this.ganancias = ganancias;
    }

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public int getIdusuario() {
        return this.idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombreempresa() {
        return nombreempresa;
    }

    public void setNombreempresa(String nombreempresa) {
        this.nombreempresa = nombreempresa;
    }

    public String getUbicaciongeografica() {
        return ubicaciongeografica;
    }

    public void setUbicaciongeografica(String ubicaciongeografica) {
        this.ubicaciongeografica = ubicaciongeografica;
    }

    public int getRestriccion() {
        return restriccion;
    }

    public void setRestriccion(int restriccion) {
        this.restriccion = restriccion;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

}