package String;

import java.util.Stack;

/**
 * Author - archit.s
 * Date - 04/09/18
 * Time - 11:20 PM
 */
public class StringCompression {

    public int compress(char[] chars) {
        int start = 0;
        int end = 0;
        int N = chars.length;

        int count = 0;

        for(int i=0;i<N;){
            char first = chars[i];

            while(end < N && first == chars[end]){
                end++;
            }

            if((end-1) > i){
                int extra = 0;
                int temp = end-i;
                Stack<Integer> s = new Stack<>();
                while(temp>0){
                    s.push(temp%10);
                    temp /= 10;
                }
                chars[start] = first;
                while(!s.empty()){
                    extra++;
                    chars[start+extra] = (char)(s.pop()+48);
                }
                start = start + extra + 1;
                count+=extra+1;
                i = end;
            }
            else{
                chars[start] = first;
                count++;
                start++;
                i++;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        char[] c = new char[]{'a', 'a', 'a', 'b', 'b', 'c', 'c'};
        System.out.println(new StringCompression().compress(c));
        System.out.println(c);
    }
}
