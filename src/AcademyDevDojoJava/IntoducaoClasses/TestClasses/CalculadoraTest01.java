package AcademyDevDojoJava.IntoducaoClasses.TestClasses;
import AcademyDevDojoJava.IntoducaoClasses.IntroducaoMetodos.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(5, 3);
        double result = calculadora.divideDoisNumeros(10, 2);
        System.out.println(result);
        System.out.println("Finalizando a Calculadoratest01");
    }
}
