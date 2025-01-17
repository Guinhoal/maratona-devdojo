package AcademyDevDojoJava.Atividade.Lista4.Dominio;

public class Pessoa {
    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\n" +
                "Sobrenome: " + sobrenome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
}
