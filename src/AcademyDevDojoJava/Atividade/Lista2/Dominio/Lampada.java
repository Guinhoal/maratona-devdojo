package AcademyDevDojoJava.Atividade.Lista2.Dominio;

public class Lampada {
    private String marca;
    private String tipo;
    private String cor;
    private int potencia;
    private float preco;
    private boolean status = false;

    public Lampada(String marca, String tipo, String cor, int potencia, float preco){
        this.marca = marca;
        this.tipo = tipo;
        this.cor = cor;
        this.potencia = potencia;
        this.preco = preco;
    }

    public Lampada(String marca, String tipo, String cor, int potencia, float preco, boolean status){
        this(marca, tipo, cor, potencia, preco);
        this.status = status;
    }

    @Override
    public String toString(){
        return "---------------------------------------------------------------\n" +
                "Marca: " + marca + "\n" +
                "Tipo: " + tipo + "\n" +
                "Cor: " + cor + "\n" +
                "Potencia: " + potencia + "W\n" +
                "Preco: " + preco + " Reais\n" +
                (status ? "A Lampada esta acesa\n" : "A Lampada esta apagada\n") +
                "---------------------------------------------------------------";
    }

    public void acender(){
        if(status == false) {
            status = true;
            System.out.println("Lampada acendida");
            return;
        }
        System.out.println("A Lampada já esta ligada");
    }

    public void apagar(){
        if(status == true){
            status = false;
            System.out.println("Lampada apagada");
            return;
        }
        System.out.println("A lampada já esta apagada");
    }

    public static int compararPotencia(Lampada lamp1, Lampada lamp2) {
        if (lamp1.getPotencia() < lamp2.getPotencia()) {
            return -1;
        } else if (lamp1.getPotencia() > lamp2.getPotencia()) {
            return 1;
        } else {
            return 0;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
