package week1additional;

import java.util.Scanner;

/**
 * Created by Николай on 28.05.2017.
 * 8) Вычислить стоимость покупки с учетом скидки. Скидка в 10% предос-
 тавляется, если сумма покупки превышает 1000 гривен.
 */
public class eight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double finalPrice;
        if(price > 1000)
            finalPrice = price*0.9;
        else
            finalPrice = price;
        System.out.println("Стоимость покупки - "+finalPrice+" грн");
    }
}
