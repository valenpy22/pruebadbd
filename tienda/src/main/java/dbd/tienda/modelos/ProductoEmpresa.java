package dbd.tienda.modelos;

import jakarta.persistence.*;

@Entity
public class ProductoEmpresa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idproductoempresa;

    @ManyToOne
    @JoinColumn(name = "idempresa")
    private Empresa empresa = new Empresa();

    @ManyToOne
    @JoinColumn(name = "idconjuntoproducto")
    private ConjuntoProducto conjuntoProducto = new ConjuntoProducto();

    private String nombreproducto;
    private int precio;
    private int stock;
    private int cantidadvendida;
    private String enlace;

    public ProductoEmpresa(){

    }

    public ProductoEmpresa(int idproductoempresa, Empresa empresa, ConjuntoProducto conjuntoProducto, String nombreproducto, int precio, int stock, int cantidadvendida, String enlace) {
        this.idproductoempresa = idproductoempresa;
        this.empresa = empresa;
        this.conjuntoProducto = conjuntoProducto;
        this.nombreproducto = nombreproducto;
        this.precio = precio;
        this.stock = stock;
        this.cantidadvendida = cantidadvendida;
        this.enlace = enlace;
    }

    public int getIdproductoempresa() {
        return idproductoempresa;
    }

    public void setIdproductoempresa(int idproductoempresa) {
        this.idproductoempresa = idproductoempresa;
    }

    public int getIdempresa() {
        return this.empresa.getIdempresa();
    }

    public void setIdempresa(int idempresa) {
        this.empresa.setIdempresa(idempresa);
    }

    public int getIdconjuntoproducto() {
        return this.conjuntoProducto.getIdconjuntoproducto();
    }

    public void setIdconjuntoproducto(int idconjuntoproducto) {
        this.conjuntoProducto.setIdconjuntoproducto(idconjuntoproducto);
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCantidadvendida() {
        return cantidadvendida;
    }

    public void setCantidadvendida(int cantidadvendida) {
        this.cantidadvendida = cantidadvendida;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }
}
