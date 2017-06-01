package week2.week2seven;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Николай on 01.06.2017.
 * Посчитать колличество букв 'a' в строке (искомый символ может быть разным)
 */
public class three {
    public static void main(String[] args) {
        String str = "hjkjghfhfgdffgdffffaaaafdgfjktyrterwerrty,,m,.mnmbnbbbvbv";
        String symb = "a";
        Pattern pattern = Pattern.compile(symb);
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while(matcher.find()){
            count++;
        }
        System.out.println("Символов "+symb+" - "+count+"шт");
    }
}
