package dbd.tienda.repositories;

import dbd.tienda.modelos.Valoraciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValoracionesRepository extends JpaRepository<Valoraciones, Integer> {
}
