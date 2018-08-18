package Array;

/**
 * Author - archit.s
 * Date - 18/08/18
 * Time - 5:53 PM
 */
public class NumberLines {

    public int[] numberOfLines(int[] widths, String S) {

        int[] result = new int[]{0,0};
        int width = 0;
        for (int i = 0; i < S.length() ; i++) {
             if(width + widths[S.charAt(i) - 'a'] > 100){
                 result[0]++;
                 width = 0;
             }
             width += widths[S.charAt(i) - 'a'];
        }

        if(width > 0){
            result[0]++;
        }
        result[1] = width;
        return result;
    }

    public static void main(String[] args) {

    }
}
