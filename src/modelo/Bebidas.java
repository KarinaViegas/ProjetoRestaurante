package modelo;

import modelo.Item;

import java.math.BigDecimal;

public class Bebidas extends Item {
    private boolean alcolica;

    public Bebidas(String nome, BigDecimal preco, boolean alcolica , Integer id) {
        super(nome, preco , id);
        this.alcolica = alcolica;
    }

    public boolean isAlcolica() {
        return alcolica;
    }

    public void setAlcolica(boolean alcolica) {
        this.alcolica = alcolica;
    }
}
