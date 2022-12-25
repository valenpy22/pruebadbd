package dbd.tienda.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.data.util.Lazy;

@Entity
public class Permiso {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idpermiso;

    //One: Rol
    //Many: Permiso
    @ManyToOne
    @JoinColumn(name = "idrol")
    private Rol rol = new Rol();

    //One: Accion
    //Many: Permiso
    @ManyToOne
    @JoinColumn(name = "idaccion")
    private Accion accion = new Accion();

    public Permiso(){

    }

    public Permiso(int idpermiso, Rol rol, Accion accion) {
        this.idpermiso = idpermiso;
        this.rol = rol;
        this.accion = accion;
    }

    public int getIdpermiso() {
        return idpermiso;
    }

    public void setIdpermiso(int idpermiso) {
        this.idpermiso = idpermiso;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Accion getAccion() {
        return accion;
    }

    public void setAccion(Accion accion) {
        this.accion = accion;
    }
}
