package week2.week2seven;

/**
 * Created by Николай on 01.06.2017.
 * Заменить в строке все символы 'a' на '@' и вывести новую строку
 */
public class five {
    public static void main(String[] args) {
        String str = "array is a data type";
        String str1 = str.replaceAll("a","@");
        System.out.println(str1);
    }
}
