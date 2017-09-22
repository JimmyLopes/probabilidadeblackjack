package meusprojetos.blackjack.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jimmy on 20/09/2017.
 */

public class Jogador {

    private List<Carta> cartasNaMao;

    public List<Carta> getCartasNaMao() {
        return cartasNaMao;
    }

    public Jogador() {
    }

    public void setCartasNaMao(List<Carta> cartasNaMao) {
        this.cartasNaMao = cartasNaMao;
    }

    public Integer calcularSomaCartas(List cartasNaMao){
        return 0;
    }

    public void pegarCarta(Carta carta){
        this.cartasNaMao.add(carta);
    }
}
