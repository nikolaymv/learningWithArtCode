package week3.three;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Николай on 03.06.2017.
 * 3.1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8
 */
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[][] matrix = new int[num1][num2];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random()*100);
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] % 5 == 0){
                    matrix[i][j] = 8;
                }
            }
        }
    }
}
