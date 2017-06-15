package week3.three;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Николай on 16.06.2017.
 * Написать морской бой(1 корабль). Размер поля указывает пользователь. При промахе показывать подсказку
 */
public class thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengthSpace = sc.nextInt();
        boolean[][] space = new boolean[lengthSpace][lengthSpace];
        int pos = (int) (Math.random() * (lengthSpace*lengthSpace));
     //   System.out.print(pos);
        space[pos/lengthSpace][pos%lengthSpace] = true;
     //   System.out.println(Arrays.deepToString(space));
        while(true){
            System.out.println("Input first coordinate cell");
            int a = sc.nextInt();
            System.out.println("Input second coordinate cell");
            int b = sc.nextInt();
            if(space[a][b]){
                System.out.println("Win");
                break;
            } else {
                System.out.println("lose");
            }
        }
    }
}
