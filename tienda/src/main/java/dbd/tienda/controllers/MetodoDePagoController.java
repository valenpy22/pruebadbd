package dbd.tienda.controllers;

import dbd.tienda.modelos.MetodoDePago;
import dbd.tienda.repositories.MetodoDePagoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodosdepago")
public class MetodoDePagoController {
    private final MetodoDePagoRepository metodoDePagoRepository;

    public MetodoDePagoController(MetodoDePagoRepository metodoDePagoRepository){
        this.metodoDePagoRepository = metodoDePagoRepository;
    }

    @PostMapping
    public void create(@RequestBody MetodoDePago m){
        this.metodoDePagoRepository.save(m);
    }

    @GetMapping
    public ResponseEntity listarMetodosDePago(){
        return ResponseEntity.ok(this.metodoDePagoRepository.findAll());
    }

    @PutMapping
    public void actualizar(@RequestBody MetodoDePago a){
        this.metodoDePagoRepository.save(a);
    }

    @DeleteMapping("/{idmetododepago}")
    public void delete(@PathVariable("idmetododepago") int idmetododepago){
        this.metodoDePagoRepository.deleteById(idmetododepago);
    }
}
