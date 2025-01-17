package AcademyDevDojoJava.Atividade.Lista4.Dominio;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String nomeFantasia;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String nomeFantasia){
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    public String toString(){
        return super.toString() + "\n" +
                "CNPJ: " + cnpj + "\n" +
                "Nome Fantasia: " + nomeFantasia + "\n" +
                "--------------------------------------------------";

    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
