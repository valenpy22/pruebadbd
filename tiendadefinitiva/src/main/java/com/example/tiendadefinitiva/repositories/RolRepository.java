package com.example.tiendadefinitiva.repositories;

import com.example.tiendadefinitiva.modelos.Rol;

import java.util.List;

public interface RolRepository{

    public Rol crear(Rol rol);

    public String actualizar(Rol rol, int idrol);
    public String actualizar_nombrerol(Rol rol, int idrol);

    public List<Rol> listarTodos();

    public List<Rol> mostrarPorId(int idrol);

    public void eliminar(int idrol);
}
