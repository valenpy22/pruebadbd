package dbd.tienda.controllers;

import dbd.tienda.modelos.ProductoEmpresa;
import dbd.tienda.repositories.ProductoEmpresaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productos")
public class ProductoEmpresaController {
    private final ProductoEmpresaRepository productoEmpresaRepository;

    public ProductoEmpresaController(ProductoEmpresaRepository productoEmpresaRepository){
        this.productoEmpresaRepository = productoEmpresaRepository;
    }

    @PostMapping
    public void create(@RequestBody ProductoEmpresa c){
        this.productoEmpresaRepository.save(c);
    }

    @GetMapping
    public ResponseEntity listarProductos(){
        return ResponseEntity.ok(this.productoEmpresaRepository.findAll());
    }

    @PutMapping
    public void actualizar(@RequestBody ProductoEmpresa a){
        this.productoEmpresaRepository.save(a);
    }

    @DeleteMapping("/{idproducto}")
    public void delete(@PathVariable("idproducto") int idproducto){
        this.productoEmpresaRepository.deleteById(idproducto);
    }
}
