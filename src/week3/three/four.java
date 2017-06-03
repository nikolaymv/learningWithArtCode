package week3.three;


import java.util.Scanner;

/**
 * Created by Николай on 03.06.2017.
 * 3.4. Создать массив, который будет состоять из диагонали матрици
 */
public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] matrix = new int[num][num];
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                matrix[i][j] = (int)(Math.random() * 100);
            }
        }
        int[] diagonal = new int[num];
        for(int i = 0; i < num; i++){
            diagonal[i] = matrix[i][i];
        }
    }
}
