package AcademyDevDojoJava.Atividade.Lista4.Test;

import AcademyDevDojoJava.Atividade.Lista4.Dominio.PessoaFisica;
import AcademyDevDojoJava.Atividade.Lista4.Dominio.PessoaJuridica;

public class ClienteHerancaTest {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João Silva", "Rua A, 123", "1234-5678", "111.222.333-44");
        PessoaJuridica pj = new PessoaJuridica("Empresa XYZ", "Avenida B, 456", "8765-4321", "12.345.678/0001-99", "XYZ Ltda");

        System.out.println(pf);
        System.out.println(pj);
    }
}