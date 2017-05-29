package week1additional;

import java.util.Scanner;

/**
 * Created by Николай on 28.05.2017.
 * 9) Написать программу вычисления идеального веса пользователя (рост-
 100). Выдать рекомендации о необходимости поправиться либо поху-
 деть.
 */
public class nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int weight = sc.nextInt();
        int idealWeight = height-100;
        if(weight>=idealWeight-5 && weight<=idealWeight+5)
            System.out.println("вес норм");
        else if (weight<idealWeight-5)
            System.out.println("больше кушай");
        else if (weight>idealWeight+5)
            System.out.println("хватит жрать!");
    }
}
