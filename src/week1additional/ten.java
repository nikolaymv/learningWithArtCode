package week1additional;

import java.util.Scanner;

/**
 * Created by Николай on 28.05.2017.
 * 10) Написать программу вычисления стоимости переговоров, если по суббо-
 там и воскресеньям предоставляется 20% скидка. Ввести продолжитель-
 ность разговора и день недели (цифра от 1 до 7).
 */
public class ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int day = sc.nextInt();
        double[] sales = {1, 1, 1, 1, 1, 0.8, 0.8};
        double pfmin = 10;
        double price = min*pfmin*sales[day-1];
        System.out.println("Стоимость разговоров - "+price+" грн");
    }
}
