package week2;

/**
 * Created by Николай on 28.05.2017.
 *
 Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
 */
public class threeEight {
    public int[] midThree(int[] nums){
        int[] a = new int[3];
        a[1] = nums[nums.length/2];
        a[0] = nums[nums.length/2-1];
        a[2] = nums[nums.length/2+1];
        return a;
    }
}
