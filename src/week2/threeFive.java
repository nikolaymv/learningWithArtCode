package week2;

/**
 * Created by Николай on 28.05.2017.
 * Given an int array length 2, return true if it does not contain a 2 or 3.
 */
public class threeFive {
    public static void main(String[] args) {
    }
    public boolean no23(int[] nums){
        if (nums[0]!=2||nums[0]!=3||nums[1]!=2||nums[1]!=3)
            return true;
        else
            return false;
    }
}
