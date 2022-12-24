package com.example.tiendadefinitiva.repositories;

import com.example.tiendadefinitiva.modelos.ConjuntoProducto;

import java.util.List;

public interface ConjuntoProductoRepository{
    // nombreConjuntoProducto

    public ConjuntoProducto crear(ConjuntoProducto conjuntoProducto);

    public String actualizar(ConjuntoProducto conjuntoProducto, int idconjuntoproducto);

    public String actualizar_nombreconjuntoproducto(ConjuntoProducto conjuntoProducto, int idconjuntoproducto);

    public List<ConjuntoProducto> listarTodos();

    public List<ConjuntoProducto> mostrarPorId(int idconjuntoproducto);

    public void eliminar(int idconjuntoproducto);
}
