package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class Ativ1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;
        int anos;
        int meses;
        int dias;
        System.out.println("Digite sua idade em anos:");
        idade = scan.nextInt();
        System.out.println("Digite quantos meses você tem além dos anos:");
        meses = scan.nextInt();
        System.out.println("Digite quantos dias além de anos e meses voce têm:");
        dias = scan.nextInt();
        dias += idade * 365 + meses * 30;
        System.out.println("Sua idade em dias é " + dias);


    }
}
