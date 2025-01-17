package AcademyDevDojoJava.Atividade.Lista4.Dominio;

public class PessoaFisica extends Cliente{
    private String cpf;

    public PessoaFisica(String nome, String endereco, String telefone, String cpf){
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    public String toString(){
        return super.toString() + "\n" + "Cpf: " + cpf + "\n" +
                "----------------------------------------------------------------------";
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }
}
