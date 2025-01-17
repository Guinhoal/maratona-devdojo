package AcademyDevDojoJava.Polimorfismo.Test;

import AcademyDevDojoJava.Polimorfismo.Dominio.Computador;
import AcademyDevDojoJava.Polimorfismo.Dominio.Produto;
import AcademyDevDojoJava.Polimorfismo.Dominio.Tomate;
import AcademyDevDojoJava.Polimorfismo.Servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);
    }
}
