package week3.three;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Николай on 11.06.2017.
 * Повернуть матрицу(Двухмерный массив). Матрица квадратная. Пользователь вводит угол кратный 90.
 */
public class eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rot = sc.nextInt();
        int arr[][] = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        int arr1[][] = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int arr2[][] = {{1,2},
                        {3,4}};
        rotate(arr, rot);
        System.out.println(Arrays.deepToString(arr));
    }
    public static void rotate(int[][] mat, int rot){
        for(int j = 0; j < mat.length/2; j++) {
            for (int i = 0; i < mat.length / 2 - j; i++) {
                int buffer = mat[j][i + j];
                System.out.println(buffer);
                mat[j][i + j] = mat[mat.length - 1 - i - j][j];
                System.out.println(mat[j][i + j]);
                mat[mat.length - 1 - i - j][j] = mat[mat.length - 1 - j][mat.length - 1 - i - j];
                System.out.println(mat[mat.length - 1 - i - j][j]);
                mat[mat.length - 1 - j][mat.length - 1 - i - j] = mat[i + j][mat.length - 1 - j];
                System.out.println(mat[mat.length - 1 - j][mat.length - 1 - i-j]);
                mat[i+j][mat.length - 1 - j] = buffer;
                System.out.println(mat[i+j][mat.length - 1 - j]);
            }
        }
    }
}
