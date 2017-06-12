package week3.three;

/**
 * Created by Николай on 05.06.2017.
 * 3.10*. Удалить из предложения слова которые повторяются.
 */
public class ten {
    public static void main(String[] args) {
        String str = "jkj rjjd jkj rjjd uuuuu iiiii kkk uuuuu";
        String[] strArr = str.split(" ");
        String str2 = "";
        out: for(int i = 0; i < strArr.length; i++){
            for(int  j = 0; j < i; j++){
                if (strArr[i].equals(strArr[j])) {
              //      System.out.println(str2);
                    continue out;
                }

            }
            str2 = str2 + " " + strArr[i];
        }
        System.out.println(str2.trim());
    }
}
