package AcademyDevDojoJava.Interface.Dominio;

public interface DataRemover {
    public abstract void remove();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
}
