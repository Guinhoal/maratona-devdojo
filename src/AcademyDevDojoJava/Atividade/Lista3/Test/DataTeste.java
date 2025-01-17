package AcademyDevDojoJava.Atividade.Lista3.Test;

import AcademyDevDojoJava.Atividade.Lista3.Dominio.Data;

import java.util.Scanner;

public class DataTeste {
    public static void main(String[] args){
        int dia, mes, ano;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o dia:");
        dia = scan.nextInt();
        System.out.println("Digite o mes:");
        mes = scan.nextInt();
        System.out.println("Digite o ano:");
        ano = scan.nextInt();
        Data data = new Data(ano, mes, dia);
        if(data.validarData(dia, mes, ano)) {
            System.out.println(data);
        }
    }
}
