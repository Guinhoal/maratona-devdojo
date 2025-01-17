package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class Codigo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cod;
        System.out.println("Digite o código:");
        cod = scan.nextInt();
        switch (cod){
            case 1:
                System.out.println("O código um foi digitado");
                break;
            case 2:
                System.out.println("O código dois foi digitado");
                break;
            case 3:
                System.out.println("O código três foi digitado");
                break;
            default:
                System.out.println("O código digitado é inválido");
                break;
        }
    }
}
