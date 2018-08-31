package String;

/**
 * Author - archit.s
 * Date - 30/08/18
 * Time - 12:37 PM
 */
public class LongestUncommonSubseq {

    public int findLUSlength(String a, String b) {

        if(a.equals(b)){
            return -1;
        }

        return Math.max(a.length(), b.length());
    }
}
