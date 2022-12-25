package dbd.tienda.controllers;

import dbd.tienda.modelos.Permiso;
import dbd.tienda.repositories.PermisoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/permisos")
public class PermisoController {
    private final PermisoRepository permisoRepository;

    public PermisoController(PermisoRepository permisoRepository){
        this.permisoRepository = permisoRepository;
    }

    @PostMapping
    public void create(@RequestBody Permiso p){
        this.permisoRepository.save(p);
    }

    @GetMapping
    public ResponseEntity listarPermisos(){
        return ResponseEntity.ok(this.permisoRepository.findAll());
    }

    @PutMapping
    public void actualizar(@RequestBody Permiso a){
        this.permisoRepository.save(a);
    }

    @DeleteMapping("/{idpermiso}")
    public void delete(@PathVariable("idpermiso") int idpermiso){
        this.permisoRepository.deleteById(idpermiso);
    }
}
