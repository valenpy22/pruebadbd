package com.example.tiendadefinitiva.repositories;

import com.example.tiendadefinitiva.modelos.Usuario;

import java.util.List;


public interface UsuarioRepository{
    // rutusuario, nombreusuario, correo, contraseña, fechanacimiento, descripcionusuario,
    // contactousuario

    public Usuario crear(Usuario usuario);

    public String actualizar(Usuario usuario, int idusuario);

    public String actualizar_rutusuario(Usuario usuario, int idusuario);

    public String actualizar_nombreusuario(Usuario usuario, int idusuario);

    public String actualizar_correo(Usuario usuario, int idusuario);

    public String actualizar_contrasena(Usuario usuario, int idusuario);

    public String actualizar_descripcionusuario(Usuario usuario, int idusuario);

    public String actualizar_contactousuario(Usuario usuario, int idusuario);

    public List<Usuario> listarTodos();

    public List<Usuario> mostrarPorId(int idusuario);

    public void eliminar(int idusuario);

}
