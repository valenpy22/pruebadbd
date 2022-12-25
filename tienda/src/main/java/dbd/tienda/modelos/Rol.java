package dbd.tienda.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/***
 * LISTO PORQUE NO NECESITA DE LLAVES FORÁNEAS
 * */

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idrol;
    private String nombrerol;

    public Rol(){

    }

    public Rol(int idrol, String nombrerol) {
        this.idrol = idrol;
        this.nombrerol = nombrerol;
    }

    public int getIdRol() {
        return idrol;
    }

    public void setIdRol(int idRol) {
        this.idrol = idRol;
    }

    public String getNombrerol() {
        return nombrerol;
    }

    public void setNombrerol(String nombrerol) {
        this.nombrerol = nombrerol;
    }
}
