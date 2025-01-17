package AcademyDevDojoJava.Exception.RunTime.Test;

import java.sql.SQLOutput;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
//        abreConexao2();
    }

    private static String abreConexao() {
        try{
            System.out.println("Abrindo o arquivo:");
//            throw new RuntimeException();
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão Aberta";
        }catch(Exception e){
            e.printStackTrace();
        } finally{
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    private static void abreConexao2() {
        try{
            System.out.println("Abrindo o arquivo:");
//            throw new RuntimeException();
            System.out.println("Escrevendo dados no arquivo");
        } finally{
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
