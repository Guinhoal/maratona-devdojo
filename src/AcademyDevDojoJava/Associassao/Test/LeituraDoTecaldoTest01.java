package AcademyDevDojoJava.Associassao.Test;
import java.util.Scanner;

public class LeituraDoTecaldoTest01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        String nome = scan.nextLine();
        System.out.println("Digite a sua idade:");
        int idade = scan.nextInt();
        System.out.println("Digite M ou F para seu sexo");
        char sexo = scan.next().charAt(0);

        System.out.println("-----------------------------------");
        System.out.println("Nome " + nome);
        System.out.println("Idade " + idade );
        System.out.println("Sexo " + sexo );

    }
}
