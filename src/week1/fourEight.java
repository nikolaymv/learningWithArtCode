package week1;

import java.util.Scanner;

/**
 * Created by Николай on 27.05.2017.
 * не понимаю при чем здесь оператор %
 */
public class fourEight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String one1 = sc.nextLine();
        String two2 = sc.nextLine();
        int one = (int)one1.charAt(one1.length()-1);
        int two = (int)two2.charAt(two2.length()-1);
        if (one == two)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
