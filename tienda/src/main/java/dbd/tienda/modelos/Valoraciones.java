package dbd.tienda.modelos;

import jakarta.persistence.*;

@Entity
public class Valoraciones{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idvaloracion;
    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Usuario usuario = new Usuario();
    @ManyToOne
    @JoinColumn(name = "idempresa")
    private Empresa empresa = new Empresa();
    public int numeroestrellas;
    private int empresafavorita;
    private String comentario;

    public Valoraciones(){

    }

    public Valoraciones(int idvaloracion, Usuario usuario, Empresa empresa, int numeroestrellas, int empresafavorita, String comentario) {
        this.idvaloracion = idvaloracion;
        this.usuario = usuario;
        this.empresa = empresa;
        this.numeroestrellas = numeroestrellas;
        this.empresafavorita = empresafavorita;
        this.comentario = comentario;
    }

    public int getIdvaloracion() {
        return idvaloracion;
    }

    public void setIdvaloracion(int idvaloracion) {
        this.idvaloracion = idvaloracion;
    }

    public int getIdusuario() {
        return this.usuario.getIdusuario();
    }

    public void setIdusuario(int idusuario) {
        this.usuario.setIdusuario(idusuario);
    }

    public int getIdempresa() {
        return this.empresa.getIdempresa();
    }

    public void setIdempresa(int idempresa) {
        this.empresa.setIdempresa(idempresa);
    }

    public int getNumeroestrellas() {
        return numeroestrellas;
    }

    public void setNumeroestrellas(int numeroestrellas) {
        this.numeroestrellas = numeroestrellas;
    }

    public int getEmpresafavorita() {
        return empresafavorita;
    }

    public void setEmpresafavorita(int empresafavorita) {
        this.empresafavorita = empresafavorita;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
