package domain.repository;

import domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findByNome(String nome);

    // Consulta JPQL para encontrar todos os clientes com pedidos
    @Query("SELECT DISTINCT c FROM Cliente c JOIN FETCH c.pedidos")
    List<Cliente> findClientesComPedidos();
}
