package dbd.tienda.modelos;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idcarrito;
    private Date fechacompra;
    private int costocompra;

    //One: Rol
    //Many: Permiso
    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Usuario usuario = new Usuario();

    //One: Accion
    //Many: Permiso
    @ManyToOne
    @JoinColumn(name = "idmetododepago")
    private MetodoDePago metododepago = new MetodoDePago();

    public Carrito(){

    }

    public Carrito(int idcarrito, Usuario idusuario, MetodoDePago metododepago, Date fechacompra, int costocompra) {
        this.idcarrito = idcarrito;
        this.usuario = idusuario;
        this.metododepago = metododepago;
        this.fechacompra = fechacompra;
        this.costocompra = costocompra;
    }

    public int getIdcarrito() {
        return idcarrito;
    }

    public void setIdcarrito(int idcarrito) {
        this.idcarrito = idcarrito;
    }

    public int getIdusuario() {
        return this.usuario.getIdusuario();
    }

    public void setIdusuario(int idusuario) {
        this.usuario.setIdusuario(idusuario);
    }

    public int getIdmetododepago() {
        return this.metododepago.getIdmetododepago();
    }

    public void setIdmetododepago(int idmetododepago) {
        this.metododepago.setIdmetododepago(idmetododepago);
    }

    public Date getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(Date fechacompra) {
        this.fechacompra = fechacompra;
    }

    public int getCostocompra() {
        return costocompra;
    }

    public void setCostocompra(int costocompra) {
        this.costocompra = costocompra;
    }
}
