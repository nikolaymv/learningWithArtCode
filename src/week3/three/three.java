package week3.three;

/**
 * Created by Николай on 03.06.2017.
 * 3.3. Написать метод, который проверяет является ли строка палиндромом
 */
public class three {
    public static void main(String[] args) {
        String str = "omomo";
        System.out.println(ifPal(str));
    }
    public static boolean ifPal(String str){
        StringBuilder str1 = new StringBuilder(str);
        String s = new String(str1.reverse());
        if(str.equals(s)){
            return true;
        }
        return false;
    }
}
