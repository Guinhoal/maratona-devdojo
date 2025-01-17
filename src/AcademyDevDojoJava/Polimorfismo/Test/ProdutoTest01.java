package AcademyDevDojoJava.Polimorfismo.Test;

import AcademyDevDojoJava.Polimorfismo.Dominio.Computador;
import AcademyDevDojoJava.Polimorfismo.Dominio.Televisao;
import AcademyDevDojoJava.Polimorfismo.Dominio.Tomate;
import AcademyDevDojoJava.Polimorfismo.Servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Sansung 50\"", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------------------------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------------------------------------------------------");
        CalculadoraImposto.calcularImposto(tv);

    }
}
