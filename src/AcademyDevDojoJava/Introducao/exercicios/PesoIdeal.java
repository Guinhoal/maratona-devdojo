package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float h;
        char sex;
        System.out.println("Digite a altura:");
        h = scan.nextFloat();
        System.out.println("Digite o sexo (M/F):");
        sex = scan.next().charAt(0);
        if (sex == 'M' || sex == 'm') {
            System.out.println("O peso ideal é: " + ((72.7 * h) - 58));
        } else if (sex == 'F' || sex == 'f') {
            System.out.println("O peso ideal é: " + ((62.1 * h) - 44.7));
        } else {
            System.out.println("Sexo inválido");
        }
    }
}

