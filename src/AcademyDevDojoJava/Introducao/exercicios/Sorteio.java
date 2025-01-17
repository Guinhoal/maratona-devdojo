package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class Sorteio {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        int valor;
        int numaleatorio;
        numaleatorio = (int) (Math.random() * 100);
        do {
            System.out.println("Digite um número:");
            valor = scan.nextInt();
            cont++;
            if (valor == numaleatorio){
                System.out.println("Parabéns, você acertou o número " + numaleatorio + " com " + cont + " tentativas.");
            } else if (valor < numaleatorio){
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }
        } while (valor != numaleatorio);

    }
}

