package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

import java.util.Scanner;
public class Estoque {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qntdminimo;
        int qntdmaximo;
        int estoquemedio;
        System.out.println("Digite a quantidade mínima do estoque:");
        qntdminimo = scan.nextInt();
        System.out.println("Digite a quantidade máxima do estoque:");
        qntdmaximo = scan.nextInt();
        estoquemedio = (qntdminimo + qntdmaximo) / 2;
        System.out.println("O estoque médio é: " + estoquemedio);
    }
}
