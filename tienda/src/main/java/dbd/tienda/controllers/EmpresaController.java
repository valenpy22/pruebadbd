package dbd.tienda.controllers;

import dbd.tienda.modelos.Empresa;
import dbd.tienda.repositories.EmpresaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
    private final EmpresaRepository empresaRepository;

    public EmpresaController(EmpresaRepository empresaRepository){
        this.empresaRepository = empresaRepository;
    }

    @PostMapping
    public void create(@RequestBody Empresa e){
        this.empresaRepository.save(e);
    }

    @GetMapping
    public ResponseEntity listarEmpresas(){
        return ResponseEntity.ok(this.empresaRepository.findAll());
    }

    @PutMapping
    public void actualizar(@RequestBody Empresa a){
        this.empresaRepository.save(a);
    }

    @DeleteMapping("/{idempresa}")
    public void delete(@PathVariable("idempresa") int idempresa){
        this.empresaRepository.deleteById(idempresa);
    }
}
