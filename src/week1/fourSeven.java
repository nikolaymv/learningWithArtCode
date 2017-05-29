package week1;

import java.util.Scanner;

/**
 * Created by Николай on 27.05.2017.
 */
public class fourSeven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        if (one%two==0){
            System.out.println("true");
            System.out.println("целая часть деления - "+one/two+", остача - "+one%two);
        } else{
            System.out.println("false");
            System.out.println("целая часть деления - "+one/two+", остача - "+one%two);
        }
    }
}
