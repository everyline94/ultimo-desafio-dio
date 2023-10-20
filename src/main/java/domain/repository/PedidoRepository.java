package domain.repository;

import domain.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    List<Pedido> findByClienteId(Long clienteId);

    List<Pedido> findByDataPedidoBetween(Date dataInicial, Date dataFinal);

    // Consulta JPQL para encontrar todos os pedidos de um cliente específico
    @Query("SELECT p FROM Pedido p WHERE p.cliente.id = :clienteId")
    List<Pedido> findPedidosByClienteId(@Param("clienteId") Long clienteId);
}
