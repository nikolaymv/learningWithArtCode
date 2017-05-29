package week1additional;

import java.util.Scanner;

/**
 * Created by Николай on 28.05.2017.
 * Написать программу, которая в зависимости от характера ветра выдает
 сообщение о его скорости от 1до 4 м/с - слабый (1); от 5-10 м/c -
 умеренный (2); от 9-18 м/c - сильный (3); больше 19 м/c - ураганный (4).
 */
public class twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        if (speed >= 1 && speed <= 4)
            System.out.println("слабый");
        else if(speed >=5 && speed <=10)
            System.out.println("умеренный");
        else if(speed >=9 && speed <=18)
            System.out.println("сильный");
        else if(speed >=19)
            System.out.println("ураганный");
    }
}
