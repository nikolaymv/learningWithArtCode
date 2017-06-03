package week3.three;

/**
 * Created by Николай on 04.06.2017.
 * Требуется найти самую длинную непрерывную цепочку нулей  и единиц в последовательности цифр.
 */
public class six {
    public static void main(String[] args) {
        String num = "10001101001";
        int count0 = 0;
        int maxCount0 = 0;
        int maxCount1 = 0;
        int count1 = 0;
        int first1 = 0;
        int first0 = 0;
        int final1 = 0;
        int final0 = 0;
        for(int i = 0; i < num.length(); i++){
            if(num.charAt(i) == '1'){
                count1++;
                count0 = 0;
                if(count1 > maxCount1){
                    maxCount1 = count1;
                    final1 = i+1;
                    first1 = i - maxCount1+2;
                }
            } else {
                count0++;
                count1 = 0;
                if(count0 > maxCount0){
                    maxCount0 = count0;
                    final0 = i+1;
                    first0 = i - maxCount0+2;
                }
            }
        }
        System.out.println("("+first0+","+final0+") - цепочка нулей");
        System.out.println("("+first1+","+final1+") - цепочка единиц");
    }
}
