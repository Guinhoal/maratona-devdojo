package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Digite o numero A:");
        a = scan.nextInt();
        System.out.println("Digite o número B:");
        b = scan.nextInt();
        if (a > b){
            System.out.println("A diferença entre A e B é: " + (a - b));
        } else {
            System.out.println("A diferença entre B e A é: " + (b - a));
        }
    }
}
