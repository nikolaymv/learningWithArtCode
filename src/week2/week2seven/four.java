package week2.week2seven;

import java.util.Arrays;

/**
 * Created by Николай on 01.06.2017.
 * Сдвинуть массив на заданное количество позиций
 */
public class four {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = shift(arr,2);
        System.out.println(Arrays.toString(arr1));
    }
    public static int[] shift(int[] arr, int n){
        int[] shiftArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(i+n < arr.length) {
                shiftArr[i + n] = arr[i];
            } else {
                shiftArr[i + n - arr.length] = arr[i];
            }
        }
        return shiftArr;
    }
}
