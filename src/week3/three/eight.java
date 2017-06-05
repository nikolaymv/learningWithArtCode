package week3.three;

import java.util.Scanner;

/**
 * Created by Николай on 04.06.2017.
 * Напишите программу, которая позволяет пользователю ввести в консоли строку,
 переводит первый символ слов в верхний регистр и результат выводит в консоль
 */
public class eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer buffer;
        for(String s : str.split(" ")){
            buffer = new StringBuffer(s);
            System.out.print(buffer.insert(0,Character.toString(s.charAt(0)).toUpperCase()).deleteCharAt(1)+" ");
        }
    }
}
