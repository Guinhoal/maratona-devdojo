package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float salario;
        float minimo = 788;
        float qntd;
        System.out.println("Digite o seu salário em R$:");
        salario = scan.nextFloat();
        qntd = salario / minimo;
        System.out.println("Você ganha " + qntd + " salários mínimos.");
    }
}