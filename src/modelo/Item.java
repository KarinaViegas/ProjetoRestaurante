package modelo;

import java.math.BigDecimal;

public class Item {

    private String nome;

    private BigDecimal preco;

    private Integer id;

    public Item(String nome, BigDecimal preco , Integer id) {
        this.nome = nome;
        this.preco = preco;
        this.id = id;
    }

    public Item() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", id=" + id +
                '}';
    }
}
