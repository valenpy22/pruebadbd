package dbd.tienda.controllers;

import dbd.tienda.modelos.Accion;
import dbd.tienda.modelos.Carrito;
import dbd.tienda.modelos.CategoriaEmpresa;
import dbd.tienda.repositories.CarritoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carritos")
public class CarritoController {
    private final CarritoRepository carritoRepository;

    public CarritoController(CarritoRepository carritoRepository){
        this.carritoRepository = carritoRepository;
    }

    @PostMapping
    public void create(@RequestBody Carrito c){
        this.carritoRepository.save(c);
    }

    @GetMapping
    public ResponseEntity listarCarritos(){
        return ResponseEntity.ok(this.carritoRepository.findAll());
    }

    @PutMapping
    public void actualizar(@RequestBody Carrito a){
        this.carritoRepository.save(a);
    }

    @DeleteMapping("/{idcarrito}")
    public void delete(@PathVariable("idcarrito") int idcarrito){
        this.carritoRepository.deleteById(idcarrito);
    }
}
