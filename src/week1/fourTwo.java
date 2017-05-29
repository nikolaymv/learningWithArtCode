package week1;

import java.util.Scanner;

/**
 * Created by Николай on 27.05.2017.
 */
public class fourTwo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int max;
        int min;
        if (one>two){
            if (one>three){
                max = one;
                if (three < two)
                    min = three;
                else
                    min = two;
            } else {
                max = three;
                min = two;
            }
        } else {
            if (two>three){
                max = two;
                if (three<one)
                    min = three;
                else
                    min = one;
            } else {
                max = three;
                min = one;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
