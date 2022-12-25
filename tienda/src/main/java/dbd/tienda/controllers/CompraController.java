package dbd.tienda.controllers;

import dbd.tienda.modelos.Compra;
import dbd.tienda.repositories.CompraRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compras")
public class CompraController {
    private final CompraRepository compraRepository;

    public CompraController(CompraRepository compraRepository){
        this.compraRepository = compraRepository;
    }

    @PostMapping
    public void create(@RequestBody Compra c){
        this.compraRepository.save(c);
    }

    @GetMapping
    public ResponseEntity listarCategoriasEmpresas(){
        return ResponseEntity.ok(this.compraRepository.findAll());
    }

    @PutMapping
    public void actualizar(@RequestBody Compra a){
        this.compraRepository.save(a);
    }

    @DeleteMapping("/{idcompra}")
    public void delete(@PathVariable("idcompra") int idcompra){
        this.compraRepository.deleteById(idcompra);
    }
}
