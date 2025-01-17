package AcademyDevDojoJava.SobrecargadeMetodos.Test;
import AcademyDevDojoJava.SobrecargadeMetodos.Dominio.Anime;

public class AnimeTest01 {
    public static void main (String[] args){
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12, "Ação");
        anime.imprime();
    }
}
