package week2.week2seven;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Николай on 01.06.2017.
 *
 */
public class test {
    public static void main(String[] args) {

    }
    public String repeatEnd(String str, int n) {
        String returnStr = "";
        for(int i = 0; i<=n; i++){
            returnStr = returnStr + str.substring(str.length() - 3);
        }
        return returnStr;
    }
}
