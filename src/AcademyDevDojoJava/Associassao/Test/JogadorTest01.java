package AcademyDevDojoJava.Associassao.Test;
import AcademyDevDojoJava.Associassao.Dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args){
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Ronaldo");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for(Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
