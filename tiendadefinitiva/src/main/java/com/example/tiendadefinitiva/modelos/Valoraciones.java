package com.example.tiendadefinitiva.modelos;

/**
 * LISTO
 * */

public class Valoraciones{
    private int idvaloracion;
    private int idusuario;
    private int idempresa;
    private int numeroestrellas;
    private int favorito;
    private String comentario;

    public Valoraciones(int idvaloracion, int idusuario, int idempresa,
                        int numeroestrellas, int favorito, String comentario) {
        this.idvaloracion = idvaloracion;
        this.idusuario = idusuario;
        this.idempresa = idempresa;
        this.numeroestrellas = numeroestrellas;
        this.favorito = favorito;
        this.comentario = comentario;
    }

    public int getIdvaloracion() {
        return this.idvaloracion;
    }

    public void setIdvaloracion(int idvaloracion) {
        this.idvaloracion = idvaloracion;
    }

    public int getIdusuario() {
        return this.idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdempresa() {
        return this.idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public int getNumeroestrellas() {
        return this.numeroestrellas;
    }

    public void setNumeroestrellas(int numeroestrellas) {
        this.numeroestrellas = numeroestrellas;
    }

    public int getEmpresafavorita() {
        return this.favorito;
    }

    public void setEmpresafavorita(int favorito) {
        this.favorito = favorito;
    }

    public String getComentario() {
        return this.comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
