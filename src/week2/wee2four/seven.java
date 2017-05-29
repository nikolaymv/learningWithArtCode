package week2.wee2four;

import java.util.Arrays;

/**
 * Created by Николай on 28.05.2017.
 * 7) Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
 */
public class seven {
    public static void main(String[] args) {
        int[] arr = {4,2,5,2,5,7};
        int[] arr1 = new int[arr.length/2];
        int[] arr2 = new int[arr.length/2];
        int sArArr1 = 0;
        int sArArr2 = 0;
        for(int i=0; i<arr.length; i++){
            if(i<arr.length/2) {
                arr1[i] = arr[i];
                sArArr1 = sArArr1+arr[i];
            }
            else {
                arr2[i - arr.length / 2] = arr[i];
                sArArr2 = sArArr2+arr[i];
            }
        }
        if(sArArr1>sArArr2)
            System.out.println(Arrays.toString(arr1));
        else
            System.out.println(Arrays.toString(arr2));
    }
}
