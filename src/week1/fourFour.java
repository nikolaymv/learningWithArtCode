package week1;

import java.util.Scanner;

/**
 * Created by Николай on 27.05.2017.
 */
public class fourFour {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if (num>=0 && num<=1)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
