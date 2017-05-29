package week1additional;

import java.util.Scanner;

/**
 * Created by Николай on 28.05.2017.
 * 2) Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
 тельные заменить на 0.
 */
public class two {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        for(int i = 0; i<num.length; i++){
            num[i] = sc.nextInt();
            if (num[i]>0){
                num[i] = num[i]*num[i]*num[i];
            } else {
                num[i] = 0;
            }
        }
    }
}
