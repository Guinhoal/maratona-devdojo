package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class Triangulo {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Digite o valor do lado A:");
        a = scan.nextInt();
        System.out.println("Digite o valor do lado B:");
        b = scan.nextInt();
        System.out.println("Digite o valor do lado C:");
        c = scan.nextInt();
        if (a < b + c && b < a + c && c < a + b){
            if (a == b && b == c){
                System.out.println("Triângulo Equilátero");
            } else if (a == b || b == c || a == c){
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
    }
}
