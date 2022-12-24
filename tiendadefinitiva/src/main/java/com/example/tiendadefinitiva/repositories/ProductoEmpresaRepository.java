package com.example.tiendadefinitiva.repositories;

import com.example.tiendadefinitiva.modelos.ProductoEmpresa;

import java.util.List;

public interface ProductoEmpresaRepository{
    // nombreproducto, precio, stock, cantidadvendida, enlace
    public ProductoEmpresa crear(ProductoEmpresa productoEmpresa);

    public String actualizar(ProductoEmpresa productoEmpresa, int idproductoEmpresa);
    public String actualizar_nombreproducto(ProductoEmpresa productoEmpresa, int idproductoEmpresa);
    public String actualizar_precio(ProductoEmpresa productoEmpresa, int idproductoEmpresa);
    public String actualizar_stock(ProductoEmpresa productoEmpresa, int idproductoEmpresa);
    public String actualizar_cantidadvendida(ProductoEmpresa productoEmpresa, int idproductoEmpresa);
    public String actualizar_enlace(ProductoEmpresa productoEmpresa, int idproductoEmpresa);

    public List<ProductoEmpresa> listarTodos();

    public List<ProductoEmpresa> mostrarPorId(int idproductoEmpresa);

    public void eliminar(int idproductoEmpresa);
}
