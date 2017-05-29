package week2.wee2four;

import java.util.Arrays;

/**
 * Created by Николай on 28.05.2017.
 * 3) Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй
 */
public class three {
    public static void main(String[] args){
        int[] a = {4, 3, 2, 6};
        int[] b = new int[4];
        b = Arrays.copyOf(a, a.length);
    }
}
