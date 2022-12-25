package dbd.tienda.controllers;

import dbd.tienda.modelos.ConjuntoProducto;
import dbd.tienda.repositories.ConjuntoProductoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conjuntosproductos")
public class ConjuntoProductoController {
    private final ConjuntoProductoRepository conjuntoProductoRepository;

    public ConjuntoProductoController(ConjuntoProductoRepository conjuntoProductoRepository){
        this.conjuntoProductoRepository = conjuntoProductoRepository;
    }

    @PostMapping
    public void create(@RequestBody ConjuntoProducto c){
        this.conjuntoProductoRepository.save(c);
    }

    @GetMapping
    public ResponseEntity listarConjuntosProducto(){
        return ResponseEntity.ok(this.conjuntoProductoRepository.findAll());
    }

    @PutMapping
    public void actualizar(@RequestBody ConjuntoProducto a){
        this.conjuntoProductoRepository.save(a);
    }

    @DeleteMapping("/{idconjuntoproducto}")
    public void delete(@PathVariable("idconjuntoproducto") int idconjuntoproducto){
        this.conjuntoProductoRepository.deleteById(idconjuntoproducto);
    }
}
