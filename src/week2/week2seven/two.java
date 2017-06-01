package week2.week2seven;

/**
 * Created by Николай on 01.06.2017.
 * 2 Проверить или является число простым
 */
public class two {
    public static void main(String[] args) {
        int num = 110;
        System.out.println(ifPrime(num));
    }
    public static boolean ifPrime(int num){
        if(num != 1){
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
