package week2.week2five.string;

import java.util.regex.Pattern;

/**
 * Created by Николай on 01.06.2017.
 * Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
 */
public class nine {
    public String seeColor(String str){
        if(Pattern.matches("red.*", str)){
            return "red";
        } else if(Pattern.matches("blue.*", str)){
            return "blue";
        }
        return "";
    }
}
