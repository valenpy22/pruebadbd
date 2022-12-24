package com.example.tiendadefinitiva.repositories;

import com.example.tiendadefinitiva.modelos.MetodoDePago;

import java.util.List;

public interface MetodoDePagoRepository{

    public MetodoDePago crear(MetodoDePago metodoDePago);

    public String actualizar(MetodoDePago metodoDePago, int idmetodoDePago);

    public String actualizar_nombremetododepago(MetodoDePago metodoDePago, int idmetodoDePago);

    public List<MetodoDePago> listarTodos();

    public List<MetodoDePago> mostrarPorId(int idmetodoDePago);

    public void eliminar(int idmetodoDePago);
}
