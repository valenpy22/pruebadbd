package com.example.tiendadefinitiva.repositories;

import com.example.tiendadefinitiva.modelos.Accion;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface AccionRepository{

    public Accion crear(Accion accion);

    public String actualizar(Accion accion, int idaccion);

    public String actualizar_descripcion(Accion accion, int idaccion);

    public List<Accion> listarTodos();

    public List<Accion> mostrarPorId(int idaccion);

    public void eliminar(int idaccion);
}
