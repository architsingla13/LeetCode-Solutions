package String;

import java.util.HashMap;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 14/08/18
 * Time - 11:45 AM
 */
public class UniqueMorseCode {

    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                temp.append(morse[word.charAt(i) - 'a']);
            }
            map.put(temp.toString(), 1);
        }

        return map.size();
    }

    public static void main(String[] args) {

        String[] input = {"archit", "singla"};
        System.out.println(new UniqueMorseCode().uniqueMorseRepresentations(input));
    }
}
