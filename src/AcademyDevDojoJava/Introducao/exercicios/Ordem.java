package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class Ordem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[3];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = scan.nextInt();
        }
        if (numeros[0] < numeros[1] && numeros[0] < numeros[2]) {
            if (numeros[1] < numeros[2]) {
                System.out.println(numeros[0] + " " + numeros[1] + " " + numeros[2]);
            } else {
                System.out.println(numeros[0] + " " + numeros[2] + " " + numeros[1]);
            }
        } else if (numeros[1] < numeros[0] && numeros[1] < numeros[2]) {
            if (numeros[0] < numeros[2]) {
                System.out.println(numeros[1] + " " + numeros[0] + " " + numeros[2]);
            } else {
                System.out.println(numeros[1] + " " + numeros[2] + " " + numeros[0]);
            }
        } else {
            if (numeros[0] < numeros[1]) {
                System.out.println(numeros[2] + " " + numeros[0] + " " + numeros[1]);
            } else {
                System.out.println(numeros[2] + " " + numeros[1] + " " + numeros[0]);
            }
        }
    }
}
