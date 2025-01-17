package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Digite o número que deseja saber o módulo:");
        num = scan.nextInt();
        if (num < 0) {
            num = num * -1;
        }
        System.out.println("O módulo do número é: " + num);
    }
}
