package dbd.tienda.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


/***
 * LISTO PORQUE NO NECESITA DE LLAVES FORÁNEAS
 * */

@Entity
public class MetodoDePago {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idmetododepago;
    private String nombremetododepago;

    public MetodoDePago(){

    }

    public MetodoDePago(int idmetododepago, String nombremetododepago) {
        this.idmetododepago = idmetododepago;
        this.nombremetododepago = nombremetododepago;
    }

    public int getIdmetododepago() {
        return idmetododepago;
    }

    public void setIdmetododepago(int idmetododepago) {
        this.idmetododepago = idmetododepago;
    }

    public String getNombremetododepago() {
        return nombremetododepago;
    }

    public void setNombremetododepago(String nombremetododepago) {
        this.nombremetododepago = nombremetododepago;
    }
}
