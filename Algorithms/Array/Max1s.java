package Array;

/**
 * Author - archit.s
 * Date - 03/09/18
 * Time - 12:00 PM
 */
public class Max1s {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;

        int cur = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                cur++;
            }
            else{
                if(cur > max){
                    max = cur;
                }
                cur = 0;
            }
        }

        if(cur > max){
            max = cur;
        }
        return max;
    }
}
