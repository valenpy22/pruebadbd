package dbd.tienda.repositories;

import dbd.tienda.modelos.Accion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccionRepository extends JpaRepository<Accion, Integer> {
}
