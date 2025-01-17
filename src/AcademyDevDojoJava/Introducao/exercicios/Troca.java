package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class Troca {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b, aux;
        System.out.println("Digite o valor de A:");
        a = scan.nextInt();
        System.out.println("Digite o valor de B");
        b = scan.nextInt();
        aux = a;
        a = b;
        b = aux;
        System.out.println("O valor de A é: " + a);
        System.out.println("O valor de B é: " + b);
    }
}
