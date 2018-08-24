package HashTable;

import java.util.HashSet;
import java.util.Set;

/**
 * Author - archit.s
 * Date - 23/08/18
 * Time - 12:43 PM
 */
public class DistributeCandies {


//     Less optimised
//     public int distributeCandies(int[] candies) {
//        Set<Integer> s = new HashSet<>();
//
//        for(int i=0;i<candies.length; i++){
//            s.add(candies[i]);
//        }
//
//        return Math.min(candies.length/2, s.size());
//    }

    public int distributeCandies(int[] candies) {
        Set<Integer> s = new HashSet<>();

        for(int candy: candies){
            if(!s.contains(candy)){
                s.add(candy);
                if(s.size() >= candies.length / 2){
                    return candies.length / 2;
                }
            }
        }

        return s.size();

    }
}
