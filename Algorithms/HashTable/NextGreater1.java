package HashTable;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Author - archit.s
 * Date - 27/08/18
 * Time - 7:16 PM
 */
public class NextGreater1 {

//  Solution using Stacks (O(n))
//
//  public int[] nextGreaterElement(int[] findNums, int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
//        Stack<Integer> stack = new Stack<>();
//        for (int num : nums) {
//            while (!stack.isEmpty() && stack.peek() < num)
//                map.put(stack.pop(), num);
//            stack.push(num);
//        }
//        for (int i = 0; i < findNums.length; i++)
//            findNums[i] = map.getOrDefault(findNums[i], -1);
//        return findNums;
//    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();

        if(nums2.length == 0){
            return new int[0];
        }

        map.put(nums2[nums2.length-1], -1);
        for(int i=nums2.length-2;i>=0;i--){
            if(nums2[i+1] > nums2[i]){
                map.put(nums2[i], nums2[i+1]);
            }
            else{
                int n = map.get(nums2[i+1]);
                while(n < nums2[i] && n != -1){
                    n = map.get(n);
                }
                map.put(nums2[i], n);
            }
        }

        for(int i=0;i<nums1.length;i++){
            nums1[i] = map.get(nums1[i]);
        }

        return nums1;
    }
}
