package week1additional;

import java.util.Scanner;

/**
 * Created by Николай on 28.05.2017.
 * 3) Дано трехзначное число. Определить: а) верно ли, что все его цифры
 одинаковые; б) есть ли среди его цифр одинаковые.
 */
public class three {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        compare(num);
    }
    public static void compare(int num){
        String sNum = Integer.toString(num);
        char oneN = sNum.charAt(0);
        char twoN = sNum.charAt(1);
        char thN = sNum.charAt(2);
        if(oneN == twoN && twoN == thN){
            System.out.println("все цифры одинаковые");
        } else if(oneN == twoN){
            System.out.println("одинаковые первая и вторая цифра");
        } else if(twoN == thN) {
            System.out.println("одинаковые вторая и третья цифра");
        } else if(oneN == thN) {
            System.out.println("одинаковые первая и третья цифра");
        } else {
            System.out.println("нет одинаковых цифр");
        }
    }
}
