package AcademyDevDojoJava.IntoducaoClasses.TestDominio;
import AcademyDevDojoJava.IntoducaoClasses.Dominio.Estudante;

public class EstudanteTest2 {
    public static void main(String[] args){
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        System.out.println("---------------------------------");
        System.out.println("Estudante 1:");
        estudante01.imprime();
        System.out.println("---------------------------------");
        System.out.println("Estudante 2:");
        estudante02.imprime();
    }
}
