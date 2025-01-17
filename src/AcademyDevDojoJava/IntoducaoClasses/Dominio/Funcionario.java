package AcademyDevDojoJava.IntoducaoClasses.Dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios = null;
    private double media = 0;


    public void imprime(){
        System.out.println("----------Funcionário----------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if(salarios != null) {
            for (int i = 0; i < salarios.length; i++) {
                System.out.println("Sálario " + (i + 1) + ": " + salarios[i]);
            }
            calculaMedia();
        }
    }

    public void calculaMedia(){
        if (salarios == null){
            System.out.println("Não é possível calcular a média sem salários");
            return;
        }
        for (int i = 0; i < 3; i++){
            media += salarios[i];
        }
        media = media/3;
        System.out.println("Média salarial: " + media);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setSalarios(double[] salarios){
        this.salarios = salarios;
    }

    public double[] getSalarios(){
        return this.salarios;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
