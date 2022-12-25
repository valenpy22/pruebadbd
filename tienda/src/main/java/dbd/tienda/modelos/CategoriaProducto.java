package dbd.tienda.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/***
 * LISTO PORQUE NO NECESITA DE LLAVES FORÁNEAS
 * */

@Entity
public class CategoriaProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idcategoriaproducto;
    private String nombreproducto;

    public CategoriaProducto(){

    }

    public CategoriaProducto(int idcategoriaproducto, String nombreproducto) {
        this.idcategoriaproducto = idcategoriaproducto;
        this.nombreproducto = nombreproducto;
    }

    public int getIdcategoriaproducto() {
        return idcategoriaproducto;
    }

    public void setIdcategoriaproducto(int idcategoriaproducto) {
        this.idcategoriaproducto = idcategoriaproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }
}
