package AcademyDevDojoJava.Associassao.Test;

import AcademyDevDojoJava.Associassao.Dominio.Aluno;
import AcademyDevDojoJava.Associassao.Dominio.Seminario;
import AcademyDevDojoJava.Associassao.Dominio.Professor;
import AcademyDevDojoJava.Associassao.Dominio.Local;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {};

        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
