package week2;

/**
 * Created by Николай on 28.05.2017.
 * Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
 */
public class threeFour {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,5,6};
        threeFour four = new threeFour();
        four.middleWay(a,b);
    }
    public int[] middleWay(int[] a, int[] b){
        int[] c = {a[1],b[1]};
        return c;
    }
}
