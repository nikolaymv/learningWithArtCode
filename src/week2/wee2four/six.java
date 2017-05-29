package week2.wee2four;

/**
 * Created by Николай on 28.05.2017.
 * 6) Найти среднее арифметическое массива
 */
public class six {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 4, 2, 7, 898};
        int summ = 0;
        double c = 0;
        for(int i = 0; i<a.length; i++){
            summ = summ+a[i];
        }
        c=(double)summ/a.length;
    }
}
