package dbd.tienda.controllers;

import dbd.tienda.modelos.Valoraciones;
import dbd.tienda.repositories.ValoracionesRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/valoraciones")
public class ValoracionesController{
    private final ValoracionesRepository valoracionesRepository;

    public ValoracionesController(ValoracionesRepository valoracionesRepository){
        this.valoracionesRepository = valoracionesRepository;
    }

    @PostMapping
    public void create(@RequestBody Valoraciones c){
        this.valoracionesRepository.save(c);
    }

    @GetMapping
    public ResponseEntity listarValoraciones(){
        return ResponseEntity.ok(this.valoracionesRepository.findAll());
    }

    @PutMapping
    public void actualizar(@RequestBody Valoraciones a){
        this.valoracionesRepository.save(a);
    }

    @DeleteMapping("/{idvaloracion}")
    public void delete(@PathVariable("idvaloracion") int idvaloracion){
        this.valoracionesRepository.deleteById(idvaloracion);
    }

}
