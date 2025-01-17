package AcademyDevDojoJava.Atividade.Lista2.Dominio;

public class Apolice {
    private String nome;
    private int idade;
    private float premio;

    public Apolice (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Apolice (String nome, int idade, float premio){
        this(nome, idade);
        this.premio = premio;
    }

    public String toString(){
        return "------------------------------------------------------------------------\n" +
                "Nome: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Premio: " + premio + "\n" +
                "------------------------------------------------------------------------";
    }

    public void calcularPremioApolice(float valor){
        this.premio = valor;
        if (idade >= 18 && idade <= 25){
            premio += (valor*20)/100;
        } else if (idade > 25 && idade <= 36){
            premio += (valor*15)/100;
        } else if (idade > 36){
            premio += (valor*10)/100;
        }
    }

    public void oferecerDesconto(String cidade){
        String cu = "Curitiba";
        String rj = "Rio de Janeiro";
        String sp = "Sao Paulo";
        String bh = "Belo Horizonte";

        boolean resultado1 = cidade.equals(cu);
        boolean resultado2 = cidade.equals(rj);
        boolean resultado3 = cidade.equals(sp);
        boolean resultado4 = cidade.equals(bh);

        if (resultado1){
            System.out.println("Desconto de 20% aplicado");
            premio -= premio/5;
            return;
        } else if (resultado2){
            System.out.println("Desconto de 15% aplicado");
            premio -= (premio*15)/100;
            return;
        } else if (resultado3){
            System.out.println("Desconto de 10% aplicado");
            premio -= premio/10;
            return;
        } else if (resultado4) {
            System.out.println("Deconto de 5% aplicado");
            premio -= (premio*5)/100;
            return;
        } else {
            System.out.println("Nenhum desconto pode ser aplicado");
            return;
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public float getPremio(){
        return premio;
    }
}
