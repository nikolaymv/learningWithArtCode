package week1additional;

import java.util.Scanner;

/**
 * Created by Николай on 28.05.2017.
 * Даны три числа A,B,C. Увеличить числа в два
 раза, если A+B+C>0, в противном случае заменить
 на нули.
 */
public class thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b+c > 0){
            a=a*2;
            b=b*2;
            c=c*2;
        } else {
            a=0;
            b=0;
            c=0;
        }
    }
}
