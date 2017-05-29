package week1additional;

import java.util.Scanner;

/**
 * Created by Николай on 28.05.2017.
 * Известны две скорости, одна в километрах в час, другая в метрах в секун-
 ду. Какая из них больше?
 */
public class four {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int spKonHour = sc.nextInt();  // километры в час
        int spMonSec = sc.nextInt();   // метры в секунду
        if ((double)spKonHour > (double)spMonSec*3.6){
            System.out.println("первая скорость больше");
        } else {
            System.out.println("вторая скорость больше");
        }
    }
}
