package week2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Николай on 28.05.2017.
 * Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
 */
public class threeOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList();
        arr.add(sc.nextInt());
        arr.add(sc.nextInt());
        arr.add(sc.nextInt());
        if(arr.get(0)==6 || arr.get(2)==6)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
