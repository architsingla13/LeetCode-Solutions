package BitManipulation;

/**
 * Author - archit.s
 * Date - 27/08/18
 * Time - 10:29 PM
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;

        for(int i=0;i<nums.length;i++){
            result ^= nums[i];
        }

        return result;
    }

}
