package week1;

import java.util.Scanner;

/**
 * Created by Николай on 27.05.2017.
 */
public class fourFive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        if(one>two)
            System.out.println(one-two);
        else
            System.out.println(one+two);
    }
}
