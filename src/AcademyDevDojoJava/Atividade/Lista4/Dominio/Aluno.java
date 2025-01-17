package AcademyDevDojoJava.Atividade.Lista4.Dominio;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, String sobrenome, int matricula){
        super(nome, sobrenome);
        this.matricula = matricula;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "Matricula: " + matricula;
    }


}
