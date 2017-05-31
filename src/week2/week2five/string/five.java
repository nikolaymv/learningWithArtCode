package week2.week2five.string;

/**
 * Created by Николай on 01.06.2017.
 * Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
 */
public class five {
    public String theEnd(String str, boolean front){
        if(front==true){
            return str.substring(0,1);
        }
        return str.substring(str.length()-1);
    }
}
