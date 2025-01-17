package AcademyDevDojoJava.Exception.RunTime.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTImeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new IndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Dentro de IndexOutOfBoundsException");
        } catch (IllegalArgumentException e ){
            System.out.println("Dentro de IllegalArgumentException");
        } catch (ArithmeticException e){
            System.out.println("Dentro de ArithmeticException");
        } catch (RuntimeException e){
            System.out.println("Dentro de RunTImeException");
        }
    }

/*    try {
        talvezLanceException();talvezLanceException
    } catch (SQLException | FileNotFoundException e){
        e.printStackTrace();
    }*/

    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
