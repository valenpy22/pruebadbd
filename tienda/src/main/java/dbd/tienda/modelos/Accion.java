package dbd.tienda.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/***
 * LISTO PORQUE NO NECESITA DE LLAVES FORÁNEAS
 * */
@Entity
public class Accion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idaccion;
    private String descripcion;

    public Accion(){

    }

    public Accion(int idaccion, String descripcion) {
        this.idaccion = idaccion;
        this.descripcion = descripcion;
    }

    public int getIdaccion() {
        return idaccion;
    }

    public void setIdaccion(int idaccion) {
        this.idaccion = idaccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
