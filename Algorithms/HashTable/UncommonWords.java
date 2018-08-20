package HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 20/08/18
 * Time - 11:20 AM
 */
public class UncommonWords {

    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> map = new HashMap<>();

        String[] s1 = A.split(" ");
        String[] s2 = B.split(" ");

        for(int i=0; i<s1.length; i++){
            if(map.containsKey(s1[i])){
                map.put(s1[i], map.get(s1[i])+1);
            }
            else{
                map.put(s1[i], 1);
            }
        }

        for(int i=0; i<s2.length; i++){
            if(map.containsKey(s2[i])){
                map.put(s2[i], map.get(s2[i])+1);
            }
            else{
                map.put(s2[i], 1);
            }
        }

        int count = 0;
        for(String s: map.keySet()){
            if(map.get(s) == 1){
                count++;
            }
        }

        String[] s = new String[count];
        int index = 0;
        for(String temp: map.keySet()){
            if(map.get(temp) == 1){
                s[index] = temp;
                index++;
            }
        }
        return s;
    }

}
