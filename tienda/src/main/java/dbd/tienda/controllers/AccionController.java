package dbd.tienda.controllers;

import dbd.tienda.modelos.Accion;
import dbd.tienda.repositories.AccionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/acciones")
public class AccionController {
    private final AccionRepository accionRepository;

    public AccionController(AccionRepository accionRepository){
        this.accionRepository = accionRepository;
    }

    @PostMapping
    public void create(@RequestBody Accion a){
        this.accionRepository.save(a);
    }

    @GetMapping
    public ResponseEntity listarAcciones(){
        return ResponseEntity.ok(this.accionRepository.findAll());
    }

    @PutMapping
    public void actualizar(@RequestBody Accion a){
        this.accionRepository.save(a);
    }

    @DeleteMapping("/{idaccion}")
    public void delete(@PathVariable("idaccion") int idaccion){
        this.accionRepository.deleteById(idaccion);
    }

}
