package dbd.tienda.modelos;

import jakarta.persistence.*;

@Entity
public class ConjuntoProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idconjuntoproducto;
    private String nombreconjuntoproducto;

    //One: Rol
    //Many: Permiso
    @ManyToOne
    @JoinColumn(name = "idcategoriaproducto")
    private CategoriaProducto categoriaproducto = new CategoriaProducto();


    public ConjuntoProducto(){

    }

    public ConjuntoProducto(int idconjuntoproducto, CategoriaProducto categoriaproducto, String nombreconjuntoproducto) {
        this.idconjuntoproducto = idconjuntoproducto;
        this.categoriaproducto = categoriaproducto;
        this.nombreconjuntoproducto = nombreconjuntoproducto;
    }

    public int getIdconjuntoproducto() {
        return idconjuntoproducto;
    }

    public void setIdconjuntoproducto(int idconjuntoproducto) {
        this.idconjuntoproducto = idconjuntoproducto;
    }

    public int getIdcategoriaproducto() {
        return this.categoriaproducto.getIdcategoriaproducto();
    }

    public void setIdcategoriaproducto(int idcategoriaproducto) {
        this.categoriaproducto.setIdcategoriaproducto(idcategoriaproducto);
    }

    public String getNombreconjuntoproducto() {
        return nombreconjuntoproducto;
    }

    public void setNombreconjuntoproducto(String nombreconjuntoproducto) {
        this.nombreconjuntoproducto = nombreconjuntoproducto;
    }
}
