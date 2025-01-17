package AcademyDevDojoJava.Introducao.exercicios;
import java.util.Scanner;

public class Vogais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = scan.nextLine();
        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.print(c + " ");
            }
        }
    }
}
