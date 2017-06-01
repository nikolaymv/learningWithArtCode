package week2.wee2four;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Николай on 28.05.2017.
 * 4) Посчитать сколько цифр(цифра задается пользователем) в массиве
 */
public class four {
    public static void main(String[] args) {
        int[] a = {3, 5, 6, 2, 7, 43, 2345, 2342, 676, 5};
  /*      String str = Arrays.toString(a);
        str = str.replaceAll("\\[", "");
        str = str.replaceAll("]", "");
        str = str.replaceAll(", ", "");
        System.out.println("цифр "+str.length()+" в массиве");
    } */
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == b){
                count++;
            }
        }
        System.out.println("цифр "+count+" в массиве");
    }
}
