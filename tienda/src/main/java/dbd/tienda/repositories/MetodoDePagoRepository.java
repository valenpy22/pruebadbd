package dbd.tienda.repositories;

import dbd.tienda.modelos.MetodoDePago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface MetodoDePagoRepository extends JpaRepository<MetodoDePago, Integer> {
}
