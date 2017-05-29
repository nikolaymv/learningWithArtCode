package week1additional;

import java.util.Scanner;

/**
 * Created by Николай on 28.05.2017.
 * 1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и определить, является ли он прямоугольным. Ответ вывести в виде сообщения.
 c2 = a2 + b2
 */
public class one {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        if (one*one == two*two+three*three || two*two==three*three+one*one || three*three == two*two + one*one){
            System.out.println("треугольник является прямоугольным");
        } else {
            System.out.println("треугольник не является прямоугольным");
        }
    }
}
