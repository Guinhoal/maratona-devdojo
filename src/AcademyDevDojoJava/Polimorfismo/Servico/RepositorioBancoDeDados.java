package AcademyDevDojoJava.Polimorfismo.Servico;

import AcademyDevDojoJava.Polimorfismo.Repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados");
    }
}
