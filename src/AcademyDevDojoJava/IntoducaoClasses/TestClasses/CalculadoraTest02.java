package AcademyDevDojoJava.IntoducaoClasses.TestClasses;
import AcademyDevDojoJava.IntoducaoClasses.IntroducaoMetodos.Calculadora;

public class CalculadoraTest02 {
    public static void main (String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
        calculadora.somaVargs(1,2,3,4,5);


    }
}
