package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class Iguais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qntd;
        int cont = 0;
        System.out.println("Digite a quantidade de números que deseja ver se são iguais:");
        qntd = scan.nextInt();
        int[] numeros1 = new int[qntd];
        int[] numeros2 = new int[qntd];
        for (int i = 0; i < numeros1.length; i++){
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros1[i] = scan.nextInt();
        }
        for (int i = 0; i < numeros2.length; i++){
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros2[i] = scan.nextInt();
        }
        for (int i = 0; i < numeros1.length; i++){
            if (numeros1[i] == numeros2[i]){
                cont++;
            }
        }
        System.out.println("Há " + cont + " números iguais.");
    }
}
