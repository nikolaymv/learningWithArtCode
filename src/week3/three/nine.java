package week3.three;

import java.util.Arrays;

/**
 * Created by Николай on 04.06.2017.
 * Умножить две матрицы.
 */
public class nine {
    public static void main(String[] args) {
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        createMatrix(matrix1);
        createMatrix(matrix2);
        int[][] matrix3 = multiplicationMatrix(matrix1, matrix2);
        System.out.println(Arrays.deepToString(matrix3));
    }
    public static void createMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random()*10);
            }
        }
    }
    public static int[][] multiplicationMatrix(int[][] matrix1, int[][] matrix2){
        if(matrix1[0].length != matrix2.length){
            return null;
        } else {
            /* сначала проверяем чтобы ширина одной матрицы равнялась высоте другой.
             Если принять размер массива matrix.length за высоту, а размер массива внутри массива matrix[0].length за ширину
             то решение ниже должно быть верно. Но я не могу разобраться как сделать то же самое для матриц, где размер
             внешнего массива будет считаться за ширину. */
            int[][] multiMatrix = new int[matrix2.length][matrix1[0].length];
            for(int i = 0; i < multiMatrix.length; i++){
                for(int j = 0; j < multiMatrix[i].length; j++){
                    multiMatrix[i][j] = 0;
                    for(int k = 0; k < matrix1[i].length; k++){
                        multiMatrix[i][j] += matrix1[i][k]*matrix2[k][j];
                    }
                }
            }
            return multiMatrix;
        }
    }
}
