package AcademyDevDojoJava.Introducao;

import java.util.Scanner;

public class TiposPrimitivosexerc {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String nome;
        String endereco;
        double salario;
        String dataRecebimentoSalario;

        System.out.println("Digite o nome:");
        nome = input.nextLine();
        System.out.println("Digite o endereço: ");
        endereco = input.nextLine();
        System.out.println("Digite o salário: ");
        salario = input.nextDouble();
        //Limpa scanner, após receber um double, para receber um nextLine
        input.nextLine();
        System.out.println("Digite a data de recebimento do salário: ");
        dataRecebimentoSalario = input.nextLine();

        System.out.println("O nome é: " + nome + "morando no endereço: " + endereco + " confirmo que recebi o salário de " + salario + " na data " + dataRecebimentoSalario);


    }
}

