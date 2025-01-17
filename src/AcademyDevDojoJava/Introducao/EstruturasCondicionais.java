package AcademyDevDojoJava.Introducao;

public class EstruturasCondicionais {
    public static void main (String[] args){
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcoólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        // Operador ternário
        System.out.println(isAutorizadoComprarBebida ? "Autorizado a comprar bebida alcoólica" : "Não autorizado a comprar bebida alcoólica");

        // if else if
        if(idade < 15){
            System.out.println("Categoria infantil");
        } else if(idade >= 15 && idade < 18){
            System.out.println("Categoria juvenil");
        } else {
            System.out.println("Categoria adulto");
        }


    }
}
