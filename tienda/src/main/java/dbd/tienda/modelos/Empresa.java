package dbd.tienda.modelos;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idempresa;

    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Usuario usuario = new Usuario();

    private String nombreempresa;
    private String ubicaciongeografica;
    private int restriccion;
    private int ganancias;

    public Empresa(){

    }

    public Empresa(int idempresa, Usuario usuario, String nombreempresa, String ubicaciongeografica, int restriccion, int ganancias) {
        this.idempresa = idempresa;
        this.usuario = usuario;
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
        return this.usuario.getIdusuario();
    }

    public void setIdusuario(int idusuario) {
        this.usuario.setIdusuario(idusuario);
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
