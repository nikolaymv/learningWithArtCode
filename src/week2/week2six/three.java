package week2.week2six;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Николай on 01.06.2017.
 * Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
 */
public class three {
    public static void main(String[] args) {
        String str = "jklsjfkcodebjsdkfjsklcofejksldjfks";
        System.out.println(bobThere(str));
    }
    public static boolean bobThere(String str) {
        Pattern pattern = Pattern.compile("b[a-q]b");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        if (count>0){
            return true;
        }
        return false;
    }

}
