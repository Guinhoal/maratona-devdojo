package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class Decrescente {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Digite um número que deseja ver ele decrescente:");
        num = scan.nextInt();
        for (int i = num; i >= 0; i--){
            System.out.println(i);
        }
    }
}
