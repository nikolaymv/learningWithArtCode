package week3.three;

/**
 * Created by Николай on 04.06.2017.
 * 3.7. Найти самое длинное слово в строке(разделенное одним пробелом)
 *
 */
public class seven {
    public static void main(String[] args) {
        String str = "Найти самое длинное слово в строке";
        int frstsmb = 0;
        int lastsmb = 0;
        int maxLastsmb = 0;
        int wordLength = 0;
        int maxLength = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ' || i == str.length() - 1){
                lastsmb = i;
            //    System.out.println(lastsmb);
                wordLength = i - frstsmb;
            //    System.out.println(wordLength);
                if(wordLength > maxLength){
                    maxLength = wordLength;
                    maxLastsmb = lastsmb;
                }
                frstsmb = lastsmb + 1;
            }
        }
        System.out.println("Самое динное слово в строке - " + str.substring(maxLastsmb-maxLength, maxLastsmb));
    }
}
