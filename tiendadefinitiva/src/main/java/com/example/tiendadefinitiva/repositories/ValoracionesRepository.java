package com.example.tiendadefinitiva.repositories;

import com.example.tiendadefinitiva.modelos.Valoraciones;

import java.util.List;

public interface ValoracionesRepository{
    // numeroestrellas, empresafavorita, comentario
    public Valoraciones crear(Valoraciones valoraciones);

    public String actualizar_numerodeestrellas(Valoraciones valoraciones, int idvaloracion);
    public String actualizar_empresafavorita(Valoraciones valoraciones, int idvaloracion);
    public String actualizar_comentario(Valoraciones valoraciones, int idvaloracion);

    public List<Valoraciones> listarTodos();

    public List<Valoraciones> mostrarPorId(int idvaloracion);

    public void eliminar(int idvaloracion);
}
