package AcademyDevDojoJava.Atividade.Lista4.Dominio;

public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;

    public Cliente(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String toString(){
        return "------------------------------------------------------------" + "\n" +
                "Nome: " + nome + "\n" +
                "Endereço: " + endereco + "\n" +
                "Telefone: " + telefone;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getTelefone(){
        return telefone;
    }
}
