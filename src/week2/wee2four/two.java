package week2.wee2four;

/**
 * Created by Николай on 28.05.2017.
 * 2) Поменять местами наибольший
 и наименьший элементы в массиве
 */
public class two {
    public static void main(String[] args) {
        int[] a = {6,3,1,6,2,8};
    }
    public static void mass(int[] a){
        int max=0;
        int maxPoz=0;
        for(int i = 0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
                maxPoz = i;
            }
        }
        int min=max;
        int minPoz=0;
        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                min = a[i];
                minPoz = i;
            }
        }
        a[maxPoz]=min;
        a[minPoz]=max;
    }
}
