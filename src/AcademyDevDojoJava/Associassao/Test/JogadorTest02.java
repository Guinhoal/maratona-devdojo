package AcademyDevDojoJava.Associassao.Test;
import AcademyDevDojoJava.Associassao.Dominio.Jogador;
import AcademyDevDojoJava.Associassao.Dominio.Time;

public class JogadorTest02 {
    public static void main(String... args){
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
