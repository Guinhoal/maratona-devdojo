package AcademyDevDojoJava.Heranca.Dominio;

public class Funcionario extends Pessoa {

    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionário");
    }

    {
        System.out.println("Dentro do bloco 1 de inincialização de Funcionário");
    }

    {
        System.out.println("Dentro do bloco 2 de inicialização de Funcionário");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do Construtor de Funcionário");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu" + this.nome + " recebi o salário de " + this.salario);
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }
}
