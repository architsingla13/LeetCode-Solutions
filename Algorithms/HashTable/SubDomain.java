package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author - archit.s
 * Date - 20/08/18
 * Time - 12:52 PM
 */
public class SubDomain {

    public List<String> subdomainVisits(String[] cpdomains) {

        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<cpdomains.length; i++){
            String[] temp = cpdomains[i].split(" ");
            Integer count = Integer.valueOf(temp[0]);
            String key = temp[1];

            map.put(key, map.getOrDefault(key, 0) + count);
            for(int j=0; j<key.length(); j++){
                if(key.charAt(j) == '.'){
                    String newKey = key.substring(j+1);
                    map.put(newKey, map.getOrDefault(newKey, 0) + count);
                }
            }
        }

        List<String> result = new ArrayList<>();
        for(String key: map.keySet()){
            StringBuilder temp = new StringBuilder(String.valueOf(map.get(key)));
            temp.append(" ");
            temp.append(key);
            result.add(temp.toString());
        }

        return result;
    }


}
