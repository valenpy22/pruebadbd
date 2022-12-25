package dbd.tienda.controllers;

import dbd.tienda.modelos.Rol;
import dbd.tienda.repositories.RolRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roles")
public class RolController {
    private final RolRepository rolRepository;

    public RolController(RolRepository rolRepository){
        this.rolRepository = rolRepository;
    }

    @PostMapping
    public void create(@RequestBody Rol u){
        this.rolRepository.save(u);
    }

    @GetMapping
    public ResponseEntity listarRoles(){
        return ResponseEntity.ok(this.rolRepository.findAll());
    }

    @PutMapping
    public void actualizar(@RequestBody Rol a){
        this.rolRepository.save(a);
    }

    @DeleteMapping("/{idrol}")
    public void delete(@PathVariable("idrol") int idrol){
        this.rolRepository.deleteById(idrol);
    }
}
