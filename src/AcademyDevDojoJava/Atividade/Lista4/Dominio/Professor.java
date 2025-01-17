package AcademyDevDojoJava.Atividade.Lista4.Dominio;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String sobrenome, String disciplina){
        super(nome, sobrenome);
        this.disciplina = disciplina;
    }

    public String toString(){
        return super.toString() + "\n" + "Disciplina: " + disciplina;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

    public String getDisciplina(){
        return disciplina;
    }
}
