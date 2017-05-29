package week2;

/**
 * Created by Николай on 28.05.2017.
 */
public class threeSeven {
    public int[] makeMidle(int[] nums){
        int[] a = new int[2];
        a[0] = nums[nums.length/2-1];
        a[1] = nums[nums.length/2];
        return a;
    }
}
