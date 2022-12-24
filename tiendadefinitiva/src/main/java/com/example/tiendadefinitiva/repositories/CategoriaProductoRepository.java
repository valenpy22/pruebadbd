package com.example.tiendadefinitiva.repositories;

import com.example.tiendadefinitiva.modelos.CategoriaProducto;

import java.util.List;

public interface CategoriaProductoRepository{

    public CategoriaProducto crear(CategoriaProducto categoriaproducto);

    public String actualizar(CategoriaProducto categoriaProducto, int idcategoriaproducto);

    public String actualizar_nombreproducto(CategoriaProducto categoriaProducto, int idcategoriaproducto);

    public List<CategoriaProducto> listarTodos();

    public List<CategoriaProducto> mostrarPorId(int idcategoriaproducto);

    public void eliminar(int idcategoriaproducto);

}
