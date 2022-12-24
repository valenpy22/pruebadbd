package com.example.tiendadefinitiva.repositories;

import com.example.tiendadefinitiva.modelos.Carrito;

import java.util.List;

public interface CarritoRepository{
    public Carrito crear(Carrito carrito);

    public String actualizar(Carrito carrito, int idcarrito);

    public String actualizar_fechacompra(Carrito carrito, int idcarrito);

    public String actualizar_costocompra(Carrito carrito, int idcarrito);

    public List<Carrito> listarTodos();

    public List<Carrito> mostrarPorId(int idcarrito);

    public void eliminar(int idcarrito);

}
