package week1additional;

import java.util.Scanner;

/**
 * Created by Николай on 28.05.2017.
 * 7) Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
 времени года. Если пользователь введет недопустимое число, программа
 должна выдать сообщение об ошибке.
 */
public class seven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nMounth = sc.nextInt();
        String[] mounth = {"Зима", "Зима", "Весна", "Весна", "Весна", "Лето", "Лето", "Лето", "Осень", "Осень", "Осень", "Зима"};
        System.out.println(mounth[nMounth-1]);
    }
}
