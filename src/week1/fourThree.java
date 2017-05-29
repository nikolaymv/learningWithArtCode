package week1;

import java.util.Scanner;

/**
 * Created by Николай on 27.05.2017.
 */
public class fourThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%7==0)
            System.out.println(num*2);
    }
}
