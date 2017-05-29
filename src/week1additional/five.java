package week1additional;

import java.util.Scanner;

/**
 * Created by Николай on 28.05.2017.
 * Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна
 пара равных
 */
public class five {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        compare(a,b,c);
    }
    public static void compare(int a, int b, int c){
        if(a == b && b == c){
            System.out.println("все одинаковые");
        } else if(a == b){
            System.out.println("одинаковые a и b");
        } else if(b == c) {
            System.out.println("одинаковые b и c");
        } else if(a == c) {
            System.out.println("одинаковые a и c");
        } else {
            System.out.println("нет одинаковых чисел");
        }
    }
}
