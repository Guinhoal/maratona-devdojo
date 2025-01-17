package AcademyDevDojoJava.Atividade.Lista3.Test;
import AcademyDevDojoJava.Atividade.Lista3.Dominio.Lampada;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LampadaTeste02 {
    public static void main(String[] args){
        Lampada[] lampadas = new Lampada[30];
        Scanner scan = new Scanner(System.in);
        int opt = -1;
        int cont = 0;
        do{
            System.out.println("--------------- SEJA BEM-VINDO AO NOSSO SISTEMA -------------------");
            System.out.println("1 - Cadastrar Lampada");
            System.out.println("2 - Exibir todas as Lampadas");
            System.out.println("3 - Exibir quantidade de Lampadas cadastradas");
            System.out.println("4 - Consultar a quantidade de Lampadas de uma determinada potência");
            System.out.println("5 - Exibir os dados das Lampadas com preço menor do que o preço médio das Lampadas cadastradas");
            System.out.println("6 - Exibir a quantidade de Lampadas acesas e apagadas");
            System.out.println("7 - Acender ou apagar uma lampada");
            System.out.println("0 - Sair");
            System.out.println();
            System.out.println("Digite a opção desejada:");
            opt = scan.nextInt();
            switch(opt){
                case 1:

                    if (cont == lampadas.length){
                        System.out.println("O máximo de lampadas já foi cadastrado!");
                        break;
                    }
                    System.out.println("--------------------------- Cadastramento Selecionado -----------------------------");
                    System.out.println("Digite a marca da Lampada:");
                    scan.nextLine();
                    String marca = scan.nextLine();
                    System.out.println("Digite o tipo da Lampada:");
                    String tipo = scan.nextLine();
                    System.out.println("Digite a cor da Lampada:");
                    String cor = scan.nextLine();
                    System.out.println("Digite a Potencia da Lampada (em w): ");
                    int potencia = scan.nextInt();
                    System.out.println("Digite o preço (em reais) da Lampada: ");
                    float preco = scan.nextFloat();
                    scan.nextLine();

                    Lampada novaLamp = new Lampada(marca, tipo, cor, potencia, preco);
                    lampadas[cont] = novaLamp;
                    cont ++;
                    break;

                case 2:
                    System.out.println("----------------------------- Exibição Selecionada ----------------------------------");
                    if (cont == 0){
                        System.out.println("Ainda não há lampadas cadastradas!");
                        break;
                    }
                    for (int i = 0; i < cont; i ++) {
                            System.out.println("---------------------------------------------------------");
                            System.out.println("Lampada " + (i + 1) + " A seguir:");
                            System.out.println(lampadas[i]);
                    }

                    break;
                case 3:
                    System.out.println("Atualmente em nosso sistema temos " + cont + " lampadas cadastradas!");
                    break;
                case 4:
                    int pont;
                    int contp = 0;
                    int contpp = 0;
                    char escolha;
                    Lampada[] newlampadas = new Lampada[30];
                    System.out.println("--------------------------------- Consultar Potencia Selecionado -----------------------------------------");
                    System.out.println("Digite a potência que deseja consultar: ");
                    pont = scan.nextInt();
                    scan.nextLine();
                    if (cont == 0){
                        System.out.println("Desculpa não há nenhuma lampada cadastrada, para poder ser realizada a pesquisa");
                    }
                    for (int i = 0; i < cont; i++) {
                        if (lampadas[i].getPotencia() == pont) {
                            newlampadas[contpp] = lampadas[i];
                            contpp++;
                            contp ++;
                        }
                    }
                    if (contp == 0){
                        System.out.println("Não há nenhuma lampada que possui a potência digitada");
                        break;
                    } else {
                        System.out.println("Há " + contp + " Lampadas com a potência desejada");
                        System.out.println("Deseja vê - las ? (S para sim e N para não)");
                        escolha = scan.next().charAt(0);
                        if (escolha == 'S' || escolha == 's') {
                            for (int i = 0; i < contpp; i++) {
                                System.out.println(newlampadas[i]);
                            }
                        }
                    }
                    break;
                case 5:
                    float precomedio;
                    float total = 0;
                    System.out.println("---------------------------- Selecionar Lampadas Baratas Selecionado -----------------------------------------");
                    for (int i = 0; i < cont; i ++){
                        total += lampadas[i].getPreco();
                    }
                    precomedio = total/cont;
                    System.out.println("------------------------------- Lampadas Abaixo do Preço Médio ----------------------------------");
                    for (int i = 0; i < cont; i ++){
                        if (lampadas[i].getPreco() < precomedio){
                            System.out.println(lampadas[i]);
                        }
                    }
                    break;
                case 6:
                    int contaceso = 0;
                    int contapagado = 0;
                    System.out.println("---------------------------------- Quantidade de Lampadas Apagadas/Acesas Selecionado ------------------------------------");
                    for (int i = 0; i < cont; i ++){
                        if (lampadas[i].isStatus()){
                            contaceso ++;
                        } else {
                            contapagado ++;
                        }
                    }
                    System.out.println("Temos " + contaceso + " Lampadas Acesas e " + contapagado + " Lampadas Apagadas");
                    break;
                case 7:
                    int optt;
                    int num;
                    System.out.println("------------------------------------ Apagar/Acender Lampada Selecionado --------------------------------------------");
                    System.out.println("1 - Acender Lampada");
                    System.out.println("2 - Apagar Lampada");
                    System.out.println("0 - Sair desta opção");
                    System.out.println("Selecione a opção desejada:");
                    optt = scan.nextInt();
                    scan.nextLine();
                    switch(optt) {
                        case 1:
                            System.out.println("Digite o número da Lampada que deseja acender (1 - 30)");
                            num = scan.nextInt();
                            if (num < 1 || num > cont) {
                                System.out.println("Número inválido. Por favor, escolha um número entre, não há uma lampada vinculada a este número");
                                break;
                            }
                            scan.nextLine();
                            num --;
                            lampadas[num].acender();
                            break;
                        case 2:
                            System.out.println("Digite o número da Lampada que deseja apaagr (1 - 30)");
                            num = scan.nextInt();
                            if (num < 1 || num > cont) {
                                System.out.println("Número inválido. Por favor, escolha um número entre, não há uma lampada vinculada a este número");
                                break;
                            }
                            scan.nextLine();
                            num --;
                            lampadas[num].apagar();
                            break;
                        case 0:
                            System.out.println("Tchauu :)");
                            break;
                        default:
                            System.out.println("Opção Inválida, selecione uma opção válida");
                            break;
                    }
                case 0:
                    System.out.println("Obrigado por usar nosso sistema, volte sempre! ");
                    break;
                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }
        } while (opt != 0);

    }
}
