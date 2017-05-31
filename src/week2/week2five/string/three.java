package week2.week2five.string;

/**
 * Created by Николай on 01.06.2017.
 *
 Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
 */
public class three {
    public String firstHalf(String str){
        return str.substring(0,str.length()/2);
    }
}
