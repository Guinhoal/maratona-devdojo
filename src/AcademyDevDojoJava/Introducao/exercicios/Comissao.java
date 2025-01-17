package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class Comissao {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        float totalvendido, totalrecebido;
        System.out.println("Digite o total vendido em R$:");
        totalvendido = scan.nextFloat();
        totalrecebido = totalvendido * 0.05f;
        System.out.println("O total recebido de comissão é: R$" + totalrecebido);
    }
}
