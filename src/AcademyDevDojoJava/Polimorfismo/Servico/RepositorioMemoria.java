package AcademyDevDojoJava.Polimorfismo.Servico;

import AcademyDevDojoJava.Polimorfismo.Repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {   @Override
public void salvar() {
    System.out.println("Salvando em memória");
}

}
