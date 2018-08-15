package Math;

import java.util.LinkedList;
import java.util.List;

/**
 * Author - archit.s
 * Date - 15/08/18
 * Time - 10:24 PM
 */
public class SelfDividing {

    private boolean isDiviisble(int input){
        int original = input;
        boolean flag = false;

        while (input != 0){
            int temp = input%10;
            input /= 10;
            if(temp == 0 || original%temp != 0){
                return false;
            }
        }

        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new LinkedList<>();

        for (int i = left; i <= right; i++) {
            if(isDiviisble(i)){
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new SelfDividing().selfDividingNumbers(1, 22));
    }
}
