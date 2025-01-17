package AcademyDevDojoJava.ModificadorEstatico.Dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    //0 - Bloco de inicialização é executado quando a JVM carregar a classe
    //1 - Alocado espaço em memória para o objeto
    //2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    //3 - Bloco de inicialização é executado
    //4 - Construtor é executado
    static{
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }
    }

    public Anime(){
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }
        for (int episodio : episodios) {
            System.out.print(episodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
