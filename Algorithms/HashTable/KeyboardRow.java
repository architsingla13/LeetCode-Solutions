package HashTable;

import java.util.*;

/**
 * Author - archit.s
 * Date - 21/08/18
 * Time - 12:10 PM
 */
public class KeyboardRow {


    public String[] findWords(String[] words) {

        Map<Character, Integer> map  = new HashMap<>();
        map.put('Q', 1);
        map.put('W', 1);
        map.put('E', 1);
        map.put('R', 1);
        map.put('T', 1);
        map.put('Y', 1);
        map.put('U', 1);
        map.put('I', 1);
        map.put('O', 1);
        map.put('P', 1);
        map.put('A', 2);
        map.put('S', 2);
        map.put('D', 2);
        map.put('F', 2);
        map.put('G', 2);
        map.put('H', 2);
        map.put('J', 2);
        map.put('K', 2);
        map.put('L', 2);
        map.put('Z', 3);
        map.put('X', 3);
        map.put('C', 3);
        map.put('V', 3);
        map.put('B', 3);
        map.put('N', 3);
        map.put('M', 3);

        List<String> l = new LinkedList<>();

        for(int i=0; i<words.length; i++){
            int value = map.get(Character.toUpperCase(words[i].charAt(0)));
            int flag = 1;
            for(int j=1; j<words[i].length(); j++){
                if(map.get(Character.toUpperCase(words[i].charAt(j))) != value){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                l.add(words[i]);
            }
        }

        return l.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] input = new String[]{"ALASKA"};
        System.out.println(Arrays.toString(new KeyboardRow().findWords(input)));
    }
}
