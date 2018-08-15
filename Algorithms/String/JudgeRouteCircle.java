package String;

/**
 * Author - archit.s
 * Date - 15/08/18
 * Time - 11:58 AM
 */
public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int v = 0;
        int h = 0;

        for (char c : moves.toCharArray()) {
            switch (c){
                case 'U':
                    v++;
                    break;
                case 'D':
                    v--;
                    break;
                case 'L':
                    h--;
                    break;
                case 'R':
                    h++;
                    break;
            }
        }

        return v == 0 && h == 0;
    }

    public static void main(String[] args) {
        System.out.println(new JudgeRouteCircle().judgeCircle("UDUDUD"));
    }
}
