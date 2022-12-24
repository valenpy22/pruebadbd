package com.example.tiendadefinitiva.repositories;

import com.example.tiendadefinitiva.modelos.Empresa;

import java.util.List;

public interface EmpresaRepository{
    // nombreempresa,ubicaciongeografica,restriccion,ganancias

    public Empresa crear(Empresa empresa);

    public String actualizar(Empresa empresa, int idempresa);

    public String actualizar_nombreempresa(Empresa empresa, int idempresa);

    public String actualizar_ubicaciongeografica(Empresa empresa, int idempresa);

    public String actualizar_restriccion(Empresa empresa, int idempresa);

    public String actualizar_ganancias(Empresa empresa, int idempresa);

    public List<Empresa> listarTodos();

    public List<Empresa> mostrarPorId(int idempresa);

    public void eliminar(int idempresa);

}
