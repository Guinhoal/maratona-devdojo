package AcademyDevDojoJava.Exception.Exceptionn.Test;

import AcademyDevDojoJava.Exception.Exceptionn.Dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner scan = new Scanner(System.in);
        String usernameDb = "Goku";
        String senhaDb = "ssj";
        System.out.println("Digite o nome do usuário: ");
        String usernameDigitado = scan.nextLine();
        System.out.println("Digite a senha: ");
        String senhaDigitada = scan.nextLine();
        if(!usernameDb.equals(usernameDigitado) || !senhaDb.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com Sucesso !!");
    }
}
