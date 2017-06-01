package week2.week2seven;

import java.util.Arrays;

/**
 * Created by Николай on 01.06.2017.
 * 1 Инвертировать массив (без использования допольнительного массива)
 */
public class one {
    public static void main(String[] args) {
        int[] arr = {67,342,44,23,90,8,88};
        int n;
        for(int i = 0; i < arr.length/2; i++){
            n = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = n;
        }
    }
}
