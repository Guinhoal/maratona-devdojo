package AcademyDevDojoJava.BlocosInicializacao.Test;
import AcademyDevDojoJava.BlocosInicializacao.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for(int episodio : anime.getEpisodios()){
            System.out.print(episodio + " ");
        }
    }
}
