package AcademyDevDojoJava.IntoducaoClasses.TestDominio;
import AcademyDevDojoJava.IntoducaoClasses.Dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args){
        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println("Nome: " + estudante.nome + " Idade: " + estudante.idade + " Sexo: " + estudante.sexo);
    }
}
