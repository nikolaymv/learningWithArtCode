package week2.week2five;

/**
 * Created by Николай on 01.06.2017.
 * Given an array of ints, return true if it contains no 1's or it contains no 4's.
 */
public class five {
    public boolean no14(int[] nums){
        if(nums.length == 4 || nums.length == 1){
            return false;
        }
        return true;
    }
}
