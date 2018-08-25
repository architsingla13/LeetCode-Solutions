package Array;

import java.util.LinkedList;
import java.util.List;

/**
 * Author - archit.s
 * Date - 24/08/18
 * Time - 11:56 AM
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {

        List<String> l = new LinkedList<>();
        for(int i=1;i<=n;i++){
            int val3 = i % 3;
            int val5 = i % 5;

            if(val3 == 0){
                if(val5 == 0){
                    l.add("FizzBuzz");
                }
                else{
                    l.add("Fizz");
                }
            }
            else if(val5 == 0){
                l.add("Buzz");
            }
            else{
                l.add(String.valueOf(i));
            }
        }

        return l;
    }
}
