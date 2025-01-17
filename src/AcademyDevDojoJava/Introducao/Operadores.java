package AcademyDevDojoJava.Introducao;

public class Operadores {
    public static void main(String[] args){
        // + - / *
        int numero1 = 10;
        int numero2 = 20;
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;
        System.out.println("A soma é: " + soma);
        System.out.println("A subtração é: " + subtracao);
        System.out.println("A multiplicação é: " + multiplicacao);
        System.out.println("A divisão é: " + divisao);

        // %
        int resto = 21 % 7;
        System.out.println("O resto da divisão é: " + resto);

        // < > <= >= == !=
        boolean dezMaiorQueVinte = 10 > 20;
        boolean dezMenorIgualVinte = 10 <= 20;
        System.out.println("Dez é maior que vinte? " + dezMaiorQueVinte);
        System.out.println("Dez é menor ou igual a vinte? " + dezMenorIgualVinte);

        // && (AND) || (OR) ! (NOT)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("Dentro da lei maior que trinta? " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("Dentro da lei menor que trinta? " + isDentroDaLeiMenorQueTrinta);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(++contador2);

    }
}
