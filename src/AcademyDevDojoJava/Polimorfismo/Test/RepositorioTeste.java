package AcademyDevDojoJava.Polimorfismo.Test;

import AcademyDevDojoJava.Polimorfismo.Repositorio.Repositorio;
import AcademyDevDojoJava.Polimorfismo.Servico.RepositorioBancoDeDados;
import AcademyDevDojoJava.Polimorfismo.Servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list );
    }
}
