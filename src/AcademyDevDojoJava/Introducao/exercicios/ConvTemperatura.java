package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;


public class ConvTemperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float tempC, tempF;
        int opc;
        System.out .println("Voce deseja realizar quais dessas operações ? \n 1 - Converter de Celsius para Fahrenheit \n 2 - Converter de Fahrenheit para Celsius");
        opc = scan.nextInt();
        switch(opc){
            case 1:
                System.out.println("Digite a temperatura em Celsius:");
                tempC = scan.nextFloat();
                tempF = (9 * tempC + 160) / 5;
                System.out.println("A temperatura em Fahrenheit é: " + tempF + "°F");
                break;
            case 2:
                System.out.println("Digite a temperatura em Fahrenheit:");
                tempF = scan.nextFloat();
                tempC = (tempF - 32) * 5 / 9;
                System.out.println("A temperatura em Celsius é: " + tempC + "°C");
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }
    }
}
