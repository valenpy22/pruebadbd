package dbd.tienda.modelos;

import jakarta.persistence.*;

@Entity
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idcompra;
    private int cantidadcompra;

    //One: Rol
    //Many: Permiso
    @ManyToOne
    @JoinColumn(name = "idproductoempresa")
    private ProductoEmpresa productoempresa = new ProductoEmpresa();

    //One: Accion
    //Many: Permiso
    @ManyToOne
    @JoinColumn(name = "idcarrito")
    private Carrito carrito = new Carrito();

    //One: Accion
    //Many: Permiso
    @ManyToOne
    @JoinColumn(name = "idempresa")
    private Empresa empresa = new Empresa();


    public Compra(){

    }

    public Compra(int idcompra, ProductoEmpresa productoempresa, Carrito carrito, Empresa empresa, int cantidadcompra) {
        this.idcompra = idcompra;
        this.productoempresa = productoempresa;
        this.carrito = carrito;
        this.empresa = empresa;
        this.cantidadcompra = cantidadcompra;
    }

    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public int getIdproductoempresa() {
        return this.productoempresa.getIdproductoempresa();
    }

    public void setIdproductoempresa(int idproductoempresa) {
        this.productoempresa.setIdproductoempresa(idproductoempresa);
    }

    public int getIdcarrito() {
        return this.carrito.getIdcarrito();
    }

    public void setIdcarrito(int idcarrito) {
        this.carrito.setIdcarrito(idcarrito);
    }

    public int getIdempresa() {
        return this.empresa.getIdempresa();
    }

    public void setIdempresa(int idempresa) {
        this.empresa.setIdempresa(idempresa);
    }

    public int getCantidadcompra() {
        return cantidadcompra;
    }

    public void setCantidadcompra(int cantidadcompra) {
        this.cantidadcompra = cantidadcompra;
    }
}
