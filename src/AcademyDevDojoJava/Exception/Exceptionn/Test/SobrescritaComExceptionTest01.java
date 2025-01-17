package AcademyDevDojoJava.Exception.Exceptionn.Test;

import AcademyDevDojoJava.Exception.Exceptionn.Dominio.Funcionario;
import AcademyDevDojoJava.Exception.Exceptionn.Dominio.LoginInvalidoException;
import AcademyDevDojoJava.Exception.Exceptionn.Dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        try{
            funcionario.salvar();
        } catch (LoginInvalidoException e){
            e.printStackTrace();
        }
    }
}
