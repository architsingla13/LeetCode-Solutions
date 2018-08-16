package Array;

import java.util.Arrays;

/**
 * Author - archit.s
 * Date - 16/08/18
 * Time - 11:06 PM
 */
public class ArrayPartition1 {
    public int arrayPairSum(int[] nums) {
        int sum = 0 ;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i+=2) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        System.out.println(new ArrayPartition1().arrayPairSum(A));
    }
}
