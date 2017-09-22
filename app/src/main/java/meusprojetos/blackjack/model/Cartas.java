package meusprojetos.blackjack.model;

/**
 * Created by Jimmy on 20/09/2017.
 */

public abstract class Cartas {
    private String naipe, nome;
    private Integer valor;

    public Cartas() {
    }

    public Cartas(String naipe, String nome, Integer valor) {
        this.naipe = naipe;
        this.nome = nome;
        this.valor = valor;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
