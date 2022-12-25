package dbd.tienda.controllers;

import dbd.tienda.modelos.CategoriaProducto;
import dbd.tienda.repositories.CategoriaProductoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categoriasproductos")
public class CategoriaProductoController {
    private final CategoriaProductoRepository categoriaProductoRepository;

    public CategoriaProductoController(CategoriaProductoRepository categoriaProductoRepository){
        this.categoriaProductoRepository = categoriaProductoRepository;
    }

    @PostMapping
    public void create(@RequestBody CategoriaProducto c){
        this.categoriaProductoRepository.save(c);
    }

    @GetMapping
    public ResponseEntity listarCategoriasProducto(){
        return ResponseEntity.ok(this.categoriaProductoRepository.findAll());
    }

    @PutMapping
    public void actualizar(@RequestBody CategoriaProducto a){
        this.categoriaProductoRepository.save(a);
    }

    @DeleteMapping("/{idcategoriaproducto}")
    public void delete(@PathVariable("idcategoriaproducto") int idcategoriaproducto){
        this.categoriaProductoRepository.deleteById(idcategoriaproducto);
    }
}
