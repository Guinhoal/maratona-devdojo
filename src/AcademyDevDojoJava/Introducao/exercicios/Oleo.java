package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class Oleo {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        float altura, raio, volume;
        System.out.println("Digite a altura da lata de óleo:");
        altura = scan.nextFloat();
        System.out.println("Digite o taio da lata de óleo:");
        raio = scan.nextFloat();
        volume = (float) (3.14159 * Math.pow(raio, 2) * altura);
        System.out.println("O volume da lata de óleo é: " + volume + "m³.");

    }
}

