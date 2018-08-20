package String;

/**
 * Author - archit.s
 * Date - 20/08/18
 * Time - 12:20 PM
 */
public class Reverse111 {

    public String reverseWords(String s) {
        String[] splitString = s.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i=0; i < splitString.length-1; i++){
            StringBuilder temp = new StringBuilder(splitString[i]);
            result.append(temp.reverse()).append(" ");
        }

        StringBuilder temp = new StringBuilder(splitString[splitString.length-1]);
        result.append(temp.reverse());

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Reverse111().reverseWords("Let's take LeetCode contest"));
    }
}
