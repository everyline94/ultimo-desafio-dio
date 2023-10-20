package domain.repository;

import domain.model.Celular;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CelularRepository extends JpaRepository<Celular, Long> {
    List<Celular> findByMarca(String marca);
}
