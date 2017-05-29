package week1;

import java.util.Scanner;

/**
 * Created by Николай on 27.05.2017.
 */
public class fiveOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String toBin = Integer.toString(num, 2);
        int toDec = Integer.parseInt(toBin, 2);
        System.out.println(toBin);
        System.out.println(toDec);
    }
}
