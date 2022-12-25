package dbd.tienda.controllers;

import dbd.tienda.modelos.Accion;
import dbd.tienda.modelos.CategoriaEmpresa;
import dbd.tienda.repositories.CategoriaEmpresaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categoriasempresas")
public class CategoriaEmpresaController {
    private final CategoriaEmpresaRepository categoriaEmpresaRepository;

    public CategoriaEmpresaController(CategoriaEmpresaRepository categoriaEmpresaRepository){
        this.categoriaEmpresaRepository = categoriaEmpresaRepository;
    }

    @PostMapping
    public void create(@RequestBody CategoriaEmpresa c){
        this.categoriaEmpresaRepository.save(c);
    }

    @GetMapping
    public ResponseEntity listarCategoriasEmpresas(){
        return ResponseEntity.ok(this.categoriaEmpresaRepository.findAll());
    }

    @PutMapping
    public void actualizar(@RequestBody CategoriaEmpresa a){
        this.categoriaEmpresaRepository.save(a);
    }

    @DeleteMapping("/{idcategoriaempresa}")
    public void delete(@PathVariable("idcategoriaempresa") int idcategoriaempresa){
        this.categoriaEmpresaRepository.deleteById(idcategoriaempresa);
    }
}
