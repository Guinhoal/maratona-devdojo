package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class Media {
    public static void main (String[] args){
        int qntd;
        int qntdmedias;
        float medmedias = 0;
        System.out.println("Digite quantas médias deseja calcular: (1 a 10)");
        Scanner scan = new Scanner(System.in);
        qntd = scan.nextInt();
        if (qntd < 1 || qntd > 10){
            System.out.println("Quantidade inválida");
            return;
        }
        float[] medias = new float [qntd];

        for (int i = 0; i < qntd; i ++){
            System.out.println("Digite quantas notas deseja realizar a média " + (i + 1) + " (1 a 5)");
            qntdmedias = scan.nextInt();
            float[] notas = new float[qntdmedias];
            for (int j = 0; j < qntdmedias; j++){
                System.out.println("Digite a nota: " +(j+1) + " :");
                notas[j] = scan.nextFloat();
                if (notas[j] < 0 || notas[j] > 10){
                    System.out.println("Nota inválida");
                    return;
                }
                if (j == qntdmedias - 1){
                    for (int aux = 0; aux < qntdmedias; aux++){
                        medias[i] += notas[aux];
                    }
                    medias[i] = medias[i] / qntdmedias;
                }
            }
        }

        for (int i = 0; i < qntd; i++){
            System.out.println("Média " + (i+1) + " : " + medias[i]);
        }

        for (int i = 0; i < qntd; i++){
            medmedias += medias[i];
        }

        medmedias = medmedias / qntd;

        System.out.println("Média das médias: " + medmedias);
    }
}
