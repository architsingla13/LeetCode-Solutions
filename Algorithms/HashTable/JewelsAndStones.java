package HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 14/08/18
 * Time - 11:34 AM
 */
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {

        int count = 0;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < J.length(); i++) {
            map.put(J.charAt(i), 1);
        }
        for (int i = 0; i < S.length(); i++) {
            Integer integer = map.get(S.charAt(i));
            if(integer != null){
                count += integer;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new JewelsAndStones().numJewelsInStones("aa", "AAa"));
    }
}
