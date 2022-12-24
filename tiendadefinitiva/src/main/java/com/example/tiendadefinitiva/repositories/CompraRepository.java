package com.example.tiendadefinitiva.repositories;

import com.example.tiendadefinitiva.modelos.Compra;

import java.util.List;

public interface CompraRepository{

    // cantidadcompra

    public Compra crear(Compra compra);

    public String actualizar(Compra compra, int idcompra);

    public String actualizar_cantidadcompra(Compra compra, int idcompra);

    public List<Compra> listarTodos();

    public List<Compra> mostrarPorId(int idcompra);

    public void eliminar(int idcompra);
}
