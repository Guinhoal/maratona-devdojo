package AcademyDevDojoJava.IntoducaoClasses.IntroducaoMetodos;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num2 != 0){
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if(num2 != 0){
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("Não é possível dividir por zero");
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int i = 0; i < numeros.length; i ++){
            soma += numeros[i];
        }
        System.out.println("A soma do array é: " + soma);
    }

    public void somaVargs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println("A soma dos números é: " + soma);
    }


}
