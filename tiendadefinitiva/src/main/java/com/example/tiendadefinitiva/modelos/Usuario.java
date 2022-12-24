package com.example.tiendadefinitiva.modelos;

/**
 * LISTO
 * */

import java.util.Date;

public class Usuario {
    private int idusuario;
    private String rutusuario;
    private String nombreusuario;
    private String correo;
    private String contrasena;
    private Date fechanacimiento;
    private String descripcionusuario;
    private String contactousuario;
    private int idrol;

    public Usuario(int idusuario, String rutusuario, String nombreusuario, String correo,
                   String contrasena, Date fechanacimiento, String descripcionusuario,
                   String contactousuario, int idrol) {

        this.idusuario = idusuario;
        this.rutusuario = rutusuario;
        this.nombreusuario = nombreusuario;
        this.correo = correo;
        this.contrasena = contrasena;
        this.fechanacimiento = fechanacimiento;
        this.descripcionusuario = descripcionusuario;
        this.contactousuario = contactousuario;
        this.idrol = idrol;
    }

    public int getIdusuario() {
        return this.idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getRutusuario() {
        return this.rutusuario;
    }

    public void setRutusuario(String rutusuario) {
        this.rutusuario = rutusuario;
    }

    public String getNombreusuario() {
        return this.nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return this.contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFechanacimiento() {
        return this.fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getDescripcionusuario() {
        return this.descripcionusuario;
    }

    public void setDescripcionusuario(String descripcionusuario) {
        this.descripcionusuario = descripcionusuario;
    }

    public String getContactousuario() {
        return this.contactousuario;
    }

    public void setContactousuario(String contactousuario) {
        this.contactousuario = contactousuario;
    }

    public int getIdrol() {
        return this.idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }
}
