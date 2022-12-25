package dbd.tienda.repositories;

import dbd.tienda.modelos.ProductoEmpresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoEmpresaRepository extends JpaRepository<ProductoEmpresa, Integer> {
}
