package week1;

import java.util.Scanner;

/**
 * Created by Николай on 27.05.2017.
 */
public class fiveTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact=num;
        // читал на википедии что факториал нуля равно единице
        if (fact!=0) {
            for (int i = num - 1; i > 0; i--) {
                fact = fact * i;
            }
        } else {
            fact = 1;
        }
        System.out.println(fact);
    }
}
