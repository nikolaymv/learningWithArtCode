package week2.week2five;

/**
 * Created by Николай on 01.06.2017.
 * Given an array of ints, return true if the array contains no 1's and no 3's.
 */
public class three {
    public boolean lucky13(int[] nums){
        for(int i = 0; i<nums.length; i++){
            if (nums[i]==1 || nums[i]==3){
                return false;
            }
        }
        return true;
    }
}
