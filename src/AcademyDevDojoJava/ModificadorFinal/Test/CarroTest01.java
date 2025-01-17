package AcademyDevDojoJava.ModificadorFinal.Test;

import AcademyDevDojoJava.ModificadorFinal.Dominio.Carro;
import AcademyDevDojoJava.ModificadorFinal.Dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();
        System.out.println(carro.getVelocidadeLimite());
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
    }
}
