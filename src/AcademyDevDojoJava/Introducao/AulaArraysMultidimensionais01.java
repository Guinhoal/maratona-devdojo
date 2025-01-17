package AcademyDevDojoJava.Introducao;

public class AulaArraysMultidimensionais01 {
    public static void main(String[] args){
        int[][] arrayInt = new int[3][3];
        arrayInt[0][0] = 22;
        arrayInt[0][1] = 11;
        arrayInt[0][2] = 4;
        arrayInt[1][0] = 44;
        arrayInt[1][1] = 55;
        arrayInt[1][2] = 9;
        arrayInt[2][0] = 77;
        arrayInt[2][1] = 33;
        arrayInt[2][2] = 99;

        for (int i = 0; i < arrayInt.length; i++){
            for (int j = 0; j < arrayInt[i].length; j++){
                System.out.println(arrayInt[i][j]);
            }
        }

        //foreach
        for (int[] arrayBase: arrayInt){
            for (int num: arrayBase){
                System.out.println(num);
            }
        }
    }
}
