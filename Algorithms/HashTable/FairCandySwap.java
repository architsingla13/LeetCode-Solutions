package HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 25/08/18
 * Time - 11:33 PM
 */
public class FairCandySwap {

    public int[] fairCandySwap(int[] A, int[] B) {

        int[] result = new int[2];
        int sum1 = 0, sum2 = 0;
        Map<Integer, Integer> m = new HashMap<>();

        for(int i=0;i<A.length; i++){
            sum1+= A[i];
            m.put(A[i], 1);
        }
        for(int i=0;i<B.length; i++){
            sum2+= B[i];
        }

        for(int i=0;i<B.length; i++){

            int temp1 = (sum1 - sum2)/2 + B[i];
            if(m.containsKey(temp1)){
                result[0] = temp1;
                result[1] = B[i];

                return result;
            }
        }

        return result;
    }
}
