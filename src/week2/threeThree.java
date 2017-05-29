package week2;

/**
 * Created by Николай on 28.05.2017.
 * Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
 */
public class threeThree {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        threeThree three = new threeThree();
        three.reverse3(a);
    }
    public int[] reverse3(int[] nums){
        int[] b = new int[nums.length];
        for(int i = 0; i<b.length; i++){
            b[i] = nums[nums.length-1-i];
        }
        return b;
    }
}
