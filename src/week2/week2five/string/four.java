package week2.week2five.string;

/**
 * Created by Николай on 01.06.2017.
 * Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
 */
public class four {
    public String nonStart(String a, String b){
        return a.substring(1) + b.substring(1);
    }
}
