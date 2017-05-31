package week2.week2five;

/**
 * Created by Николай on 01.06.2017.
 * Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
 */
public class eight {
    public boolean madThree(int[] nums){
        int countEven = 0;
        int countOdd = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                countEven++;
                countOdd = 0;
                if(countEven==3)
                    return true;
            } else {
                countOdd++;
                countEven = 0;
                if(countOdd==3)
                    return true;
            }
        }
        return false;
    }
}
