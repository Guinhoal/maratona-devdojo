package AcademyDevDojoJava.Atividade.Lista2.Test;

import AcademyDevDojoJava.Atividade.Lista2.Dominio.Lampada;

public class LampadaTeste {
    public static void main(String[] args) {
        Lampada lamp1 = new Lampada("Philips", "LED", "Branca", 9, 19.99f);
        Lampada lamp2 = new Lampada("Osram", "Fluorescente", "Amarela", 15, 24.99f);
        Lampada lamp3 = new Lampada("GE", "Incandescente", "Branca", 60, 5.99f);

        System.out.println(lamp1);
        System.out.println(lamp2);
        System.out.println(lamp3);

        lamp1.acender();
        lamp3.acender();

        System.out.println("Metade");
        System.out.println(lamp1);

        lamp1.apagar();

        System.out.println("FINAL");

        System.out.println(lamp1);
        System.out.println(lamp2);
        System.out.println(lamp3);

        int avis = Lampada.compararPotencia(lamp1, lamp2);
        if (avis == -1){
            System.out.println("A Lampada 2 tem uma potencia maior que a Lampada 1");
        } else if (avis == 1) {
            System.out.println("A Lampada 1 tem ujma potencia maior que a Lampada 2");
        } else if (avis == 0) {
            System.out.println("As duas Lampadas tem a mesma potência");
        }
    }
}
