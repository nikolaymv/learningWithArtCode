package week3.three;

import java.util.Scanner;

/**
 * Created by Николай on 03.06.2017.
 * 3.2. Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.
 */
public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean[][] matrix = new boolean[num1][num2];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(i == j){
                    matrix[i][j] = true;
                }
            }
        }
    }
}
