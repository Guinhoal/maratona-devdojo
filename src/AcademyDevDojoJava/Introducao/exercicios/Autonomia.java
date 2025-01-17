package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class Autonomia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float velocidade, litros, autonomia, temp;
        autonomia = 12;
        System.out.println("Digite o tempo de viagem em horas:");
        temp = scan.nextFloat();
        System.out.println("Digite a velocidade média em km/h:");
        velocidade = scan.nextFloat();
        litros = (temp * velocidade) / autonomia;
        System.out.println("A quantidade de litros necessária é: " + litros);
    }
}