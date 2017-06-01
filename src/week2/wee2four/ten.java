package week2.wee2four;

import java.util.Arrays;

/**
 * Created by Николай on 29.05.2017.
 * 10) public static int[] splitArray(int[] arr, int start, int end) { // обрезать массив по границам start и end
 }
 */
public class ten {
    public static void main(String[] args) {
        int[] arr = {12,34,5,64,65,56,232,13,23,54,23};
        int[] arr1 = splitArray(arr,3,9);
    }
    public static int[] splitArray(int[] arr, int start, int end){
        int[] arr1 = new int[end-start-1];
        for (int i = start+1, j = 0; i<end; i++, j++){
            arr1[j] = arr[i];
        }
        return arr1;
    }

}
