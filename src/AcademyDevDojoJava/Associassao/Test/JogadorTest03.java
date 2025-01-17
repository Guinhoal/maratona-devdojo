package AcademyDevDojoJava.Associassao.Test;
import AcademyDevDojoJava.Associassao.Dominio.Jogador;
import  AcademyDevDojoJava.Associassao.Dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Zico");
        Jogador jogador4 = new Jogador("Ronaldo");
        Jogador jogador5 = new Jogador("Ronaldinho");
        Jogador jogador6 = new Jogador("Rivaldo");
        Jogador jogador7 = new Jogador("Cafu");
        Jogador jogador8 = new Jogador("Roberto Carlos");
        Jogador jogador9 = new Jogador("Kaká");
        Jogador jogador10 = new Jogador("Neymar");
        Jogador[] jogadores = {jogador1, jogador2, jogador3, jogador4, jogador5, jogador6, jogador7, jogador8, jogador9, jogador10};
        Time time = new Time("Seleção Brasileira", jogadores);
        time.imprime();
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
