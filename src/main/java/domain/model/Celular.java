package domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "celulares")
public class Celular {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long marca;

    @Column(nullable = false)
    private String modelo;;

    @Column(nullable = false)
    private String preco;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Pedido> pedidos;

    private int id;

    public Celular(Long marca, String modelo, String preco, List<Pedido> pedidos) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.pedidos = pedidos;
    }

    public Long getMarca() {
        return marca;
    }

    public void setMarca(Long marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void setId(Long id) {
        this.id = Math.toIntExact(id);
    }
}