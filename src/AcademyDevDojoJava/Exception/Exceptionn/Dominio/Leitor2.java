package AcademyDevDojoJava.Exception.Exceptionn.Dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor2 implements Closeable {
    public void close() throws IOException {
        System.out.println("Fechando leitor 2");
    }
}
