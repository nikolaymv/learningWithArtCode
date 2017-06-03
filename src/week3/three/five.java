package week3.three;

import java.util.Scanner;

/**
 * Created by Николай on 03.06.2017.
 * 3.5. а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
 b) Поменять наибольший и наименьший столбик в двухмерном массиве.
 */
public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] matrix = new int[num][num];
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                matrix[i][j] = (int)(Math.random() * 100);
            }
        }
        int[][] matrix2 = substitutionRows(matrix);
        int[][] matrix3 = substitutionColumns(matrix);
    }
    public static int[][] substitutionRows(int[][] matrix){
        //метод замены строк
        int[] sums = new int[matrix.length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                sums[i] = sums[i] + matrix[j][i];
            }
        }
        int max = 0;
        int pozMax = 0;
        for(int i = 0; i < sums.length; i++){
            if(sums[i] > max){
                max = sums[i];
                pozMax = i;
            }
        }
        int min = max;
        int pozMin = 0;
        for(int i = 0; i < sums.length; i++){
            if(sums[i] < min){
                min = sums[i];
                pozMin = i;
            }
        }
        int buffer;
        for(int i = 0; i < matrix.length; i++){
            buffer = matrix[i][pozMin];
            matrix[i][pozMin] = matrix[i][pozMax];
            matrix[i][pozMax] = buffer;
        }
        return matrix;
    }
    public static int[][] substitutionColumns(int[][] matrix){
        // метод замены столбцов
        int[] sums = new int[matrix.length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                sums[i] = sums[i] + matrix[i][j];
            }
        }
        int max = 0;
        int pozMax = 0;
        for(int i = 0; i < sums.length; i++){
            if(sums[i] > max){
                max = sums[i];
                pozMax = i;
            }
        }
        int min = max;
        int pozMin = 0;
        for(int i = 0; i < sums.length; i++){
            if(sums[i] < min){
                min = sums[i];
                pozMin = i;
            }
        }
        int buffer;
        for(int i = 0; i < matrix.length; i++){
            buffer = matrix[pozMin][i];
            matrix[pozMin][i] = matrix[pozMax][i];
            matrix[pozMax][i] = buffer;
        }
        return matrix;
    }
}
