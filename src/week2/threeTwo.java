package week2;

import java.util.Scanner;

/**
 * Created by Николай on 28.05.2017.
 *
 Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
 */
public class threeTwo {
    public static void main(String[] args) {
        int[] a = {5,6,7};
        int[] b = {4,4,7};
        commonEnd(a,b);
    }
    public static boolean commonEnd(int[] a, int[] b){
        if(a[0]==b[0]||a[a.length-1]==b[b.length-1])
            return true;
        else
            return false;
    }
}
