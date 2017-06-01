package week2.wee2four;

import java.util.Arrays;

/**
 * Created by Николай on 28.05.2017.
 * 5) Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные
 */
public class five {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0; i<arr.length; i++){
            if(i%2!=0) {
                arr[i] = (int) (Math.random() * 100);
                if (arr[i]%2==0){
                    arr[i]=arr[i]-1;
                }
            } else {
                arr[i] = (int) (Math.random() * 100);
                if (arr[i]%2!=0){
                    arr[i]=arr[i]+1;
                }
            }
        }
    }
}
