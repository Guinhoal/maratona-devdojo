package AcademyDevDojoJava.Polimorfismo.Servico;

import AcademyDevDojoJava.Polimorfismo.Dominio.Computador;
import AcademyDevDojoJava.Polimorfismo.Dominio.Produto;
import AcademyDevDojoJava.Polimorfismo.Dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if(produto instanceof Tomate) {
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println("Data de validade " + dataValidade);
        }
    }
}
