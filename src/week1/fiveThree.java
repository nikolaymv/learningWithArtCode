package week1;

import java.util.Scanner;

/**
 * Created by Николай on 27.05.2017.
 */
public class fiveThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int sEight = 0;
        for(int i=0; i<num.length(); i++){
            if(num.charAt(i) == '8'){
                sEight++;
            }
        }
        System.out.println(sEight);
    }
}
