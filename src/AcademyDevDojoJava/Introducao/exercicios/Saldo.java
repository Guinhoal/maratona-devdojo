package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class Saldo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float saldo;
        double reajuste;
        System.out.println("Digite o seu saldo atual em R$:");
        saldo = scan.nextFloat();
        reajuste = saldo * 1.01;
        System.out.println("Seu saldo com reajuste de 1% é: R$" + reajuste);
    }
}
