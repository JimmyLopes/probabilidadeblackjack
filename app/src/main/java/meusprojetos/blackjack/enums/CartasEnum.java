package meusprojetos.blackjack.enums;

/**
 * Created by Jimmy on 20/09/2017.
 */

public enum CartasEnum {
    AS("Ás",11),UM("Ás",1),DOIS("Dois",2),TRES("Três",3),QUATRO("Quatro",4),CINCO("Cinco",5),SEIS("Seis",6),SETE("Sete",7),OITO("Oito",8),
    NOVE("Nove",9),DEZ("Dez",10),J("Valete",10),Q("Dama",10),K("Rei",10);

    public int valorCarta;
    public String nomeCarta;

    CartasEnum(String nome, int valor){
        valorCarta = valor;
        nomeCarta = nome;
    }

}
