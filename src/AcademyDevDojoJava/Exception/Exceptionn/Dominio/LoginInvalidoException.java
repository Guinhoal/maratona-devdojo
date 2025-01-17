package AcademyDevDojoJava.Exception.Exceptionn.Dominio;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("login Inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
