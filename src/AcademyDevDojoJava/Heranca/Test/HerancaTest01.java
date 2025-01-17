package AcademyDevDojoJava.Heranca.Test;

import AcademyDevDojoJava.Heranca.Dominio.Endereco;
import AcademyDevDojoJava.Heranca.Dominio.Funcionario;
import AcademyDevDojoJava.Heranca.Dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args){
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("1111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("22222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        System.out.println("-----------------------------------------------");

        funcionario.imprime();
    }
}
