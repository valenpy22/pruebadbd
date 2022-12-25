package dbd.tienda.repositories;

import dbd.tienda.modelos.CategoriaEmpresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaEmpresaRepository extends JpaRepository<CategoriaEmpresa, Integer> {
}
