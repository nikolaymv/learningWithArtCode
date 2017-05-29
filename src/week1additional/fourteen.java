package week1additional;

import java.util.Scanner;

/**
 * Created by Николай on 28.05.2017.
 * 14) Определить, является ли шестизначное число "счастливым" (сумма
 первых трех цифр равна сумме последних трех цифр).
 */
public class fourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int a1 = (int)num.charAt(0);
        int a2 = (int)num.charAt(1);
        int a3 = (int)num.charAt(2);
        int b1 = (int)num.charAt(3);
        int b2 = (int)num.charAt(4);
        int b3 = (int)num.charAt(5);
        if(a1+a2+a3==b1+b2+b3)
            System.out.println("счастлив");
        else
            System.out.println("несчастлив");
    }
}
