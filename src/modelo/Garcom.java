package modelo;

public class Garcom{

    private String nome;

    private String senha;

    private Double comissao;

    public Garcom(String nome, String senha, Double comissao) {
        this.nome = nome;
        this.senha = senha;
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;

    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }


    @Override
    public String toString() {
        return "modelo.Garcom{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", comissao=" + comissao +
                '}';
    }
}
