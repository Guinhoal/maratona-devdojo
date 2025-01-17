package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class Cotacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float cot, vldolar, vlreais;
        System.out.println("Digite a cotação do dólar:");
        cot = scan.nextFloat();
        System.out.println("Digite o valor em dólar:");
        vldolar = scan.nextFloat();
        vlreais = cot * vldolar;
        System.out.println("O valor em reais é: R$" + vlreais);

    }
}
