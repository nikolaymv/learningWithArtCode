package week2.wee2four;

import java.util.Arrays;

/**
 * Created by Николай on 28.05.2017.
 * Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
 который получается в результате суммы arr1[i] + arr2[i]
 */
public class eight {
    public static void main(String[] args) {
        int[] arr1 = {3,5,2,5};
        int[] arr2 = {6,5,2,7};
        int[] arr = new int[4];
        for(int i=0; i< arr1.length; i++){
            arr[i]=arr1[i]+arr2[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
