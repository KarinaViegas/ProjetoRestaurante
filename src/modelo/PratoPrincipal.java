package modelo;

import java.math.BigDecimal;

public class PratoPrincipal extends Item {

    private Integer serveQuantasPessoas;

    public PratoPrincipal(String nome, BigDecimal preco , Integer serveQuantasPessoas , Integer id) {
        super(nome, preco , id);
        this.serveQuantasPessoas = serveQuantasPessoas;
    }

    public Integer getServeQuantasPessoas() {
        return serveQuantasPessoas;
    }

    public void setServeQuantasPessoas(Integer serveQuantasPessoas) {
        serveQuantasPessoas = serveQuantasPessoas;
    }


    @Override
    public String toString() {
        return "modelo.PratoPrincipal{" +
                "serveQuantasPessoas=" + serveQuantasPessoas +
                '}';
    }
}
