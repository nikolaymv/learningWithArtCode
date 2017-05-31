package week2.week2five;

/**
 * Created by Николай on 01.06.2017.
 * Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
 */
public class two {
    public int sum13(int[] nums){
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=13){
                count = count+nums[i];
            }
        }
        return count;
    }
}
