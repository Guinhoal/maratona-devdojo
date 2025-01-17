package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class NegativoOuNao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        char opcao;
        do {
            System.out.println("Digite um número:");
            num = scan.nextInt();
            if (num < 0) {
                System.out.println("O número é negativo");
            } else {
                System.out.println("O número não é negativo");
            }
            System.out.println("Deseja verificar outro número? (S/N)");
            opcao = scan.next().toUpperCase().charAt(0);
        } while (opcao == 'S');
    }
}
