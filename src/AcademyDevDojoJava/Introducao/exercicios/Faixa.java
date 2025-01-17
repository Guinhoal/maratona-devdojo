package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class Faixa {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Digite um número:");
        num = scan.nextInt();
        if (num > 0 && num < 9){
            System.out.println("O valor é válido");
        } else {
            System.out.println("O valor é inválido");
        }
    }
}
