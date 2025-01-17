package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class Relacionamento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite o primeiro número:");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo número:");
        num2 = scan.nextInt();
        if (num1 > num2) {
            System.out.println("O número " + num1 + " é maior que o número " + num2);
        } else if (num1 < num2) {
            System.out.println("O número " + num1 + " é menor que o número " + num2);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}

