package AcademyDevDojoJava.Interface.Test;

import AcademyDevDojoJava.Interface.Dominio.FileLoader;
import AcademyDevDojoJava.Interface.Dominio.DatabaseLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        fileLoader.remove();
        databaseLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
