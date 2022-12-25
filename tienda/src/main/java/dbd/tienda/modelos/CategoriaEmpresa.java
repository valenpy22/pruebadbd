package dbd.tienda.modelos;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RestController;

@Entity
public class CategoriaEmpresa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idcategoriaempresa;

    @ManyToOne
    @JoinColumn(name = "idcategoriaproducto")
    private CategoriaProducto categoriaproducto = new CategoriaProducto();

    //One: Rol
    //Many: Permiso
    @ManyToOne
    @JoinColumn(name = "idempresa")
    private Empresa empresa = new Empresa();



    public CategoriaEmpresa(){

    }

    public CategoriaEmpresa(int idcategoriaempresa, Empresa empresa, CategoriaProducto categoriaproducto) {
        this.idcategoriaempresa = idcategoriaempresa;
        this.empresa = empresa;
        this.categoriaproducto = categoriaproducto;
    }

    public int getIdcategoriaempresa() {
        return idcategoriaempresa;
    }

    public void setIdcategoriaempresa(int idcategoriaempresa) {
        this.idcategoriaempresa = idcategoriaempresa;
    }

    public int getIdEmpresa() {
        return this.empresa.getIdempresa();
    }

    public void setIdEmpresa(int idempresa) {
        this.empresa.setIdempresa(idempresa);
    }

    public int getIdcategoriaProducto() {
        return this.categoriaproducto.getIdcategoriaproducto();
    }

    public void setIdCategoriaProducto(int idcategoriaproducto) {
        this.categoriaproducto.setIdcategoriaproducto(idcategoriaproducto);
    }
}
