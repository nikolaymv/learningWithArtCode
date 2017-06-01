package week2.week2six;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Николай on 01.06.2017.
 *
 Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
 кодингбат не принял мое решение
 */
public class two {
    public static void main(String[] args) {
        String str = "jklsjfkcodejsdkfjsklcofejksldjfks";
        System.out.println(countCode(str));
    }
    public static int countCode(String str) {
        Pattern pattern = Pattern.compile("co[a-q]e");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        return count;
    }
}
