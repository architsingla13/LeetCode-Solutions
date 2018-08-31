package BitManipulation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author - archit.s
 * Date - 30/08/18
 * Time - 12:16 PM
 */
public class PrimaryOfSetBits {

    private int countBits(int value){
        int count = 0;

        while(value > 0){
            if((value & 1) == 1){
                count++;
            }
            value = value>>1;
        }

        return count;
    }

    public int countPrimeSetBits(int L, int R) {

        Integer a[] = {2,3,5,7,11,13,17,19};
        Set<Integer> s = new HashSet<>(Arrays.asList(a));

        int result = 0;

        for(int i=L;i<=R; i++){

            if(s.contains(countBits(i))){
                result++;
            }
        }

        return result;
    }
}
