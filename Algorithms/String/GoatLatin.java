package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author - archit.s
 * Date - 30/08/18
 * Time - 1:05 PM
 */
public class GoatLatin {
    public String toGoatLatin(String S) {

        Character c[] = {'a','e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        Set<Character> s = new HashSet<>(Arrays.asList(c));
        S = S.trim();
        StringBuilder sb = new StringBuilder();

        int space = 1;
        int i = 0;
        while(i<S.length()){

            boolean vowel = s.contains(S.charAt(i));
            boolean first = true;
            char firstC = 'a';
            while(i< S.length() && S.charAt(i) != ' '){
                if(first){
                    if(!vowel){
                        firstC = S.charAt(i);
                    }
                    else{
                        sb.append(S.charAt(i));
                    }
                    first = false;
                }
                else{
                    sb.append(S.charAt(i));
                }
                i++;
            }
            if(!vowel){
                sb.append(firstC);
            }
            sb.append("ma");
            for(int j=0;j<space;j++){
                sb.append('a');
            }
            while(i< S.length() && S.charAt(i) == ' '){
                i++;
            }
            if(i < S.length()){
                sb.append(' ');
            }
            space++;
        }

        return sb.toString();
    }
}
