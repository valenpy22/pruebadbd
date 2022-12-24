package com.example.tiendadefinitiva.repositories;

import com.example.tiendadefinitiva.modelos.Permiso;

import java.util.List;

public interface PermisoRepository{
    public Permiso crear(Permiso permiso);

    public String actualizar(Permiso permiso, int idpermiso);

    public List<Permiso> listarTodos();

    public List<Permiso> mostrarPorId(int idpermiso);

    public void eliminar(int idpermiso);
}
