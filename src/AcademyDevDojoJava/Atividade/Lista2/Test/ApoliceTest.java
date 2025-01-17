package AcademyDevDojoJava.Atividade.Lista2.Test;
import java.util.Scanner;
import AcademyDevDojoJava.Atividade.Lista2.Dominio.Apolice;

public class ApoliceTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do segurado:");
        String nome = scan.nextLine();
        System.out.println("Digite a idade do segurado");
        int idade = scan.nextInt();
        scan.nextLine();
        if (idade < 18 || idade > 120){
            System.out.println("Idade fora do intervalo permitido.");
            System.exit(0);
        }
        Apolice ap1 = new Apolice(nome, idade);
        ap1.calcularPremioApolice(1000);

        System.out.println(ap1);

        System.out.println("Digite a sua cidade: ");
        String cidade = scan.nextLine();

        ap1.oferecerDesconto(cidade);

        System.out.println(ap1);
    }
}
