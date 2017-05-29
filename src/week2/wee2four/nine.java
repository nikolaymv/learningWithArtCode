package week2.wee2four;


/**
 * Created by Николай on 28.05.2017.
 * 9) Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.
 */
public class nine {
    public static void main(String[] args) {
        int[] arr1 = new int[4];
        int[] arr2 = new int[4];
        for(int i=0; i<arr1.length; i++){
            arr1[i] = 25+(int) (Math.random() * 50);
            arr2[i] = 25+(int) (Math.random() * 50);
        }
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<arr1.length;i++){
            if(arr1[i]%2==0){
                count1++;
            }
            if(arr2[i]%2==0){
                count2++;
            }
        }
        if(count1>count2){
            System.out.println("больше парных чисел в первом массиве");
        } else if(count2<count1){
            System.out.println("больше парных чисел во втором массиве");
        }
    }
}
