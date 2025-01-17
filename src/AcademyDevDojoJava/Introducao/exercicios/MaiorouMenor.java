package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class MaiorouMenor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        int num;
        int contmaior = 0;
        int contmenor = 0;
        int contigual = 0;
        for (int i = 0; i < 10; i ++){
            System.out.println("Digite o número da posição " + (i+ 1) + ":");
            numeros[i] = scan.nextInt();
        }
        System.out.println("Digite o numero que deseja checar:");
        num = scan.nextInt();
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > num){
                contmaior++;
            } else if (numeros[i] < num){
                contmenor++;
            } else {
                contigual++;
            }
        }
        System.out.println("Quantidade de números maiores que " + num + ": " + contmaior);
        System.out.println("Quantidade de números menores que " + num + ": " + contmenor);
        System.out.println("Quantidade de números iguais a " + num + ": " + contigual);
    }
}