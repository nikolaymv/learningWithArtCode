package week2.week2five;

/**
 * Created by Николай on 31.05.2017.
 * Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
 */
public class one {
    public int countEvens(int[] nums){
        int a = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2 == 0){
                a++;
            }
        }
        return a;
    }
}
