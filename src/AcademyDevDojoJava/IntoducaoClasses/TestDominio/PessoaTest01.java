package AcademyDevDojoJava.IntoducaoClasses.TestDominio;
import AcademyDevDojoJava.IntoducaoClasses.Dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);
        pessoa.imprime();

        System.out.println("Nome: " + pessoa.getNome());
    }
}
