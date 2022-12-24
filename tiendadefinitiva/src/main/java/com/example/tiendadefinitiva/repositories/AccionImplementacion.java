package com.example.tiendadefinitiva.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import com.example.tiendadefinitiva.modelos.*;

import java.util.List;

@Repository
public class AccionImplementacion implements AccionRepository {

    @Autowired
    private Sql2o sql2o;

    @Override
    public Accion crear(Accion accion){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO Accion (idAccion,descripcion)" +
                    "VALUES (:idAccion,:descripcion)";
            conn.createQuery(sql, true)
                    //.addParameter("idAccion",Accion.getIdAccion())
                    .addParameter("idAccion", accion.getIdaccion())
                    .addParameter("descripcion", accion.getDescripcion())
                    .executeUpdate();
            return accion;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Accion> listarTodos() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Accion order by idAccion ASC")
                    .executeAndFetch(Accion.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Accion> mostrarPorId(int id) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Accion where idAccion = :id ")
                    .addParameter("id",id)
                    .executeAndFetch(Accion.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void eliminar(int id) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from Accion where idAccion = :id ")
                    .addParameter("id",id)
                    .executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String actualizar(Accion accion, int id){
        try(Connection conn = sql2o.open()){
            String updateSql = "update Accion set idAccion=:idAccion WHERE idAccion=:id";
            conn.createQuery(updateSql)
                    .addParameter("idAccion", accion.getIdaccion())
                    .executeUpdate();
            return "Se actualizó el Accion";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar Accion";
        }
    }

    @Override
    public String actualizar_descripcion(Accion accion, int id){
        try(Connection conn = sql2o.open()){
            String updateSql = "update Accion set idAccion=:idAccion WHERE idAccion=:id";
            conn.createQuery(updateSql)
                    .addParameter("id_admin_categoria_empresa", id)
                    .addParameter("id_admin", accion.getIdaccion())
                    .executeUpdate();
            return "Se actualizó descripción Accion";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar Accion";
        }
    }

}
