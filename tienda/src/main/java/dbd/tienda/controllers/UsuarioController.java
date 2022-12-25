package dbd.tienda.controllers;

import dbd.tienda.modelos.Usuario;
import dbd.tienda.repositories.UsuarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping
    public void create(@RequestBody Usuario u){
        this.usuarioRepository.save(u);
    }

    @GetMapping
    public ResponseEntity listarUsuarios(){
        return ResponseEntity.ok(this.usuarioRepository.findAll());
    }

    @PutMapping
    public void actualizar(@RequestBody Usuario a){
        this.usuarioRepository.save(a);
    }

    @DeleteMapping("/{idusuario}")
    public void delete(@PathVariable int idusuario){
        this.usuarioRepository.deleteById(idusuario);
    }
}
