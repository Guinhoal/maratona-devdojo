package AcademyDevDojoJava.Heranca.Test;

import AcademyDevDojoJava.Heranca.Dominio.Funcionario;

public class HerancaTest02 {
    //0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar classe pai
    //1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar filha
    //2 - Alocado espaço em memória para o objeto da superclasse
    //3 - Cada atributo da superclasse é criado e inicializado com seus valores default ou valores explicitos
    //4 -  Bloco de inicialização da superclasse é executado na ordem em que aparece
    //5 - O Construtor da superclasse é executado
    //6 - Alocado espaço em memória para o objeto da subclasse
    //7 - Cada atributo da subclasse é criado e inicializado com seus valores default ou valores explicitos
    //8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    //4 - Construtor da subclasse é executado

    public static void main(String[] args){
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}

