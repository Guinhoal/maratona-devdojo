package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class Contrario {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int qntd;
        System.out.println("Digite a quantiodade de números que deseja ver em ordem contrária:");
        qntd = scan.nextInt();
        int[] numeros = new int[qntd];
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = scan.nextInt();
        }
        for (int i = numeros.length - 1; i >= 0; i--){
            System.out.println(numeros[i]);
        }
    }
}
