package week2.week2five.string;

/**
 * Created by Николай on 01.06.2017.
 * Given a string, return true if it ends in "ly".
 */
public class six {
    public boolean endsLy(String str){
        if(str.substring(str.length()-2)=="ly"){
            return true;
        }
        return false;
    }
}
