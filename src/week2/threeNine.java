package week2;

/**
 * Created by Николай on 28.05.2017.
 *
 We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
 */
public class threeNine {
    public boolean unlucky1(int[] nums){
        if (nums[3]==1){
            return false;
        } else {
            return true;
        }
    }
}
