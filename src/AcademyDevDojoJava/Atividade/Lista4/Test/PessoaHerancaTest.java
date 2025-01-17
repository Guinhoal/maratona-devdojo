package AcademyDevDojoJava.Atividade.Lista4.Test;

import AcademyDevDojoJava.Atividade.Lista4.Dominio.Pessoa;
import AcademyDevDojoJava.Atividade.Lista4.Dominio.Aluno;
import AcademyDevDojoJava.Atividade.Lista4.Dominio.Professor;

public class PessoaHerancaTest {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Jesus", "Expedito Pinto");
        Aluno aluno1 = new Aluno("Thiago Arthur", "Almeida Pinto", 2023952616);
        Professor professor1 = new Professor("João", "Montadon", "POO");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(pessoa1);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(aluno1);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(professor1);
        System.out.println("------------------------------------------------------------------------------");

    }
}
