package AcademyDevDojoJava.Atividade.Lista3.Dominio;

public class Data {
    private int ano;
    private int mes;
    private int dia;

    public Data(int ano, int mes, int dia){
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    @Override
    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }

    public boolean validarData(int dia, int mes, int ano){
        if (dia < 1 || mes < 1 || ano < 0){
            System.out.println("Data Inválida");
            return false;
        }
        if (dia > 31 || mes > 12 ){
            System.out.println("Data inválida");
            return false;
        }
        System.out.println("Data Válida");
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println("O Ano é bissexto !");
        } else {
            System.out.println("O ano não é bissexto");
        }
        return true;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getAno(){
        return ano;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getMes(){
        return mes;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getDia(){
        return dia;
    }
}
