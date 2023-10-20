package domain.service;

import domain.model.Pedido;
import domain.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository; // Injete o repositório JPA correspondente

    public List<Pedido> getAllPedidos() {
        return pedidoRepository.findAll();
    }

    public Pedido getPedidoById(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public Pedido createPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public Pedido updatePedido(Long id, Pedido pedido) {
        if (pedidoRepository.existsById(id)) {
            pedido.setId(id);
            return pedidoRepository.save(pedido);
        }
        return null;
    }

    public void deletePedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}
