package week1additional;

import java.util.Scanner;

/**
 * Created by Николай on 28.05.2017.
 * 6) У вас есть скорость и растояние, за какое время вы приедете в пукт назначания
 */
public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt(); //скорость в км/ч
        int distance = sc.nextInt(); // расстояние в км
        System.out.println("я приеду через "+ (double)distance/speed + "ч");
    }
}
