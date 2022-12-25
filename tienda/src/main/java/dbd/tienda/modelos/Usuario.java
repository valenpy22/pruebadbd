package dbd.tienda.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idusuario;
    private String rutusuario;
    private String nombreusuario;
    private String correo;
    private String contrasena;
    private Date fechanacimiento;
    private String descripcionusuario;
    private String contactousuario;

    @ManyToOne
    @JoinColumn(name = "idrol")
    private Rol rol = new Rol();

    public Usuario(){

    }

    public Usuario(int idusuario, String rutusuario, String nombreusuario, String correo, String contrasena, Date fechanacimiento, String descripcionusuario, String contactousuario, int idrol) {
        Rol rol = new Rol();
        this.idusuario = idusuario;
        this.rutusuario = rutusuario;
        this.nombreusuario = nombreusuario;
        this.correo = correo;
        this.contrasena = contrasena;
        this.fechanacimiento = fechanacimiento;
        this.descripcionusuario = descripcionusuario;
        this.contactousuario = contactousuario;
        this.rol.setIdRol(idrol);
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getRutusuario() {
        return rutusuario;
    }

    public void setRutusuario(String rutusuario) {
        this.rutusuario = rutusuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getDescripcionusuario() {
        return descripcionusuario;
    }

    public void setDescripcionusuario(String descripcionusuario) {
        this.descripcionusuario = descripcionusuario;
    }

    public String getContactousuario() {
        return contactousuario;
    }

    public void setContactousuario(String contactousuario) {
        this.contactousuario = contactousuario;
    }

    public int getIdrol() {
        return this.rol.getIdRol();
    }

    public void setIdrol(int idrol) {
        this.rol.setIdRol(idrol);
    }
}
