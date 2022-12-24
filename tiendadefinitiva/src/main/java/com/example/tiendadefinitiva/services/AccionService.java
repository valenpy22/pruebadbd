package com.example.tiendadefinitiva.services;

import com.example.tiendadefinitiva.modelos.Accion;
import com.example.tiendadefinitiva.repositories.AccionRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/acciones")
public class AccionService {
    private final AccionRepository accionRepository;

    public AccionService(@Lazy AccionRepository accionRepository){
        this.accionRepository = accionRepository;
    }

    @PostMapping
    public void create(@RequestBody Accion a){
        Accion res = accionRepository.crear(a);
    }

    @GetMapping
    public List<Accion> getAll(){
        return accionRepository.listarTodos();
    }

    @GetMapping("/{id}")
    public List<Accion> getId(@PathVariable int id){
        return accionRepository.mostrarPorId(id);
    }

    @PutMapping("/{id}")
    public String update(@RequestBody Accion a, @PathVariable int id){
        String res = accionRepository.actualizar(a, id);
        return res;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        accionRepository.eliminar(id);
    }
}
