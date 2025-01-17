package AcademyDevDojoJava.ModificadorFinal.Dominio;

public class Carro {
    private String nome;
    private static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public double getVelocidadeLimite(){
        return VELOCIDADE_LIMITE;
    }



}
