package AcademyDevDojoJava.IntoducaoClasses.TestDominio;
import AcademyDevDojoJava.IntoducaoClasses.Dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args){
        Carro MeuCarro = new Carro();
        Carro MeuPrimeiroCarro = new Carro();

        MeuCarro.nome = "Porsche";
        MeuCarro.modelo = "911";
        MeuCarro.ano = 2021;

        MeuPrimeiroCarro.nome = "Vw Passat";
        MeuPrimeiroCarro.modelo = "TSI";
        MeuPrimeiroCarro.ano = 2019;

        MeuPrimeiroCarro = MeuCarro;

        System.out.println("Meu Primeiro Carro:");
        System.out.println("Nome: " + MeuPrimeiroCarro.nome + " Modelo: " + MeuPrimeiroCarro.modelo + " Ano: " + MeuPrimeiroCarro.ano);

        System.out.println("Meu Carro:");
        System.out.println("Nome: " + MeuCarro.nome + " Modelo: " + MeuCarro.modelo + " Ano: " + MeuCarro.ano);
    }
}
