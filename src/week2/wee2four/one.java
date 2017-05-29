package week2.wee2four;

import java.util.ArrayList;

import static java.util.Collections.sort;

/**
 * Created by Николай on 28.05.2017.
 * 1) Найти минимальное и максимальное значения в массиве и вывести их на консоль
 */
public class one {
    public static void main(String[] args) {
        int[] a = {7,3,1,9,4};
        minMax(a);
    }
    public static void minMax(int[] a){
        ArrayList<Integer> arr = new ArrayList();
        for(int i=0; i<a.length; i++) {
            arr.add(a[i]);
        }
        sort(arr);
        int min = arr.get(0);
        int max = arr.get(arr.size()-1);
        System.out.println(min);
        System.out.println(max);
    }
}
