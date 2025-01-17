package AcademyDevDojoJava.Construtores.Test;
import AcademyDevDojoJava.Construtores.Dominio.Anime;

public class AnimeTest01 {
    public static void main (String[] args){
        Anime anime = new Anime("Haikyuu", "TV", 12, "Ação", "Production IG");
        anime.imprime();
    }
}
