package com.example.tiendadefinitiva.repositories;

import com.example.tiendadefinitiva.modelos.CategoriaEmpresa;

import java.util.List;

public interface CategoriaEmpresaRepository{

    public CategoriaEmpresa crear(CategoriaEmpresa categoriaEmpresa);

    public String actualizar(CategoriaEmpresa categoriaEmpresa, int idcategoriaempresa);

    public List<CategoriaEmpresa> listarTodos();

    public List<CategoriaEmpresa> mostrarPorId(int idcategoriaempresa);

    public void eliminar(int idcategoriaempresa);
}
