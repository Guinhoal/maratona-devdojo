package AcademyDevDojoJava.Introducao;

public class EstruturasCondicionais02 {
    public static void main (String[] args){
        // Imprima dia da semana, considerando 1 como domingo
        byte dia = 5;
        // char, int, byte, short, enum e String, variaveis que podem ser colocadas no switch
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        // char, int, byte, short, enum e String, variaveis que podem ser colocadas no switch
        char sexo = 'M';
        switch (sexo){
            case 'F':
                System.out.println("Feminino");
                break;
            case 'M':
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
