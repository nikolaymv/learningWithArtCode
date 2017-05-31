package week2.week2five.string;

/**
 * Created by Николай on 01.06.2017.
 *
 Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
 */
public class two {
    public String makeOutWorld(String out, String world){
        return out.substring(0,2).concat(world).concat(out.substring(2));
    }
}
