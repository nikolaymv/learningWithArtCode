package week1;

import java.util.Scanner;

/**
 * Created by Николай on 27.05.2017.
 */
public class fourOne {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        if (hour >= 9 && hour <= 18){
            System.out.println("Я на работе");
        } else {
            System.out.println("Я отдыхаю");
        }
    }
}
