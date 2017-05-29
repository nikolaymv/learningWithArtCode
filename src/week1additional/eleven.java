package week1additional;

import java.util.Scanner;

/**
 * Created by Николай on 28.05.2017.
 * 11) Написать программу, которая при вводе числа в диапазоне от 1 до 99
 добавляет к нему слово "копейка" в правильной форме. Например, 1
 копейка, 5 копеек, 42 копейки
 */
public class eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kop = sc.nextInt();
        if(kop%10 == 1 && kop != 11)
            System.out.println(kop + " копейка");
        else if (kop%10 >= 2 && kop%10 <= 4 && kop!=12 && kop!=13 && kop!=14)
            System.out.println(kop + " копейки");
        else
            System.out.println(kop + " копеек");
    }
}
