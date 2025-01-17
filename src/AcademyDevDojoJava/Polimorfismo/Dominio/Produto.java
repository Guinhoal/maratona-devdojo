package AcademyDevDojoJava.Polimorfismo.Dominio;

public abstract class Produto implements Taxavel {
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome(){
        return this.nome;
    }

    public double getValor(){
        return this.valor;
    }

}
