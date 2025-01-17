package AcademyDevDojoJava.Atividade.Lista2.Dominio;

public class Caneta {
    private String marca;
    private String cor;
    private float tamanho;

    public Caneta (String marca, String cor, float tamanho) {
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    @Override
    public String toString(){
        return "----------------------------------------------------------------------\n" +
                "Marca: " + marca + "\n" +
                "Cor: " + cor + "\n" +
                "Tamanho: " + tamanho + "cm\n" +
                "----------------------------------------------------------------------";

    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void setTamanho(float tamanho){
        this.tamanho = tamanho;
    }

    public float getTamanho(){
        return tamanho;
    }
}
