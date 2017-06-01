package week2.week2five.string;

/**
 * Created by Николай on 01.06.2017.
 * Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char
 */
public class eight {
    public static void main(String[] args) {
        System.out.println(lastChars("hjk", ""));
    }
    public static String lastChars(String a, String b){
        if(a.length()==0){
            a = "@";
        } else if(b.length()==0){
            b = "@";
        }
        return Character.toString(a.charAt(0)) + b.charAt(b.length()-1);
    }
}
