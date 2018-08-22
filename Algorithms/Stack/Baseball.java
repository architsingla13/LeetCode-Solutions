package Stack;

import java.util.Stack;

/**
 * Author - archit.s
 * Date - 22/08/18
 * Time - 12:13 PM
 */
public class Baseball {

    public int calPoints(String[] ops) {

        int length = ops.length;
        int sum = 0;

        Stack<Integer> s = new Stack<>();
        int num, num1, num2;
        for (String op : ops) {

            switch (op) {
                case "C":
                    num = s.pop();
                    sum -= num;
                    break;
                case "D":
                    num = s.pop();
                    sum += 2 * num;
                    s.push(num);
                    s.push(2 * num);
                    break;
                case "+":
                    num2 = s.pop();
                    num1 = s.pop();
                    sum += num1 + num2;
                    s.push(num1);
                    s.push(num2);
                    s.push(num1 + num2);
                    break;
                default:
                    num = Integer.valueOf(op);
                    sum += num;
                    s.push(num);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String[] s = new String[]{"57","D","-3","-58","D","77","+","C","+","+","38","78","-6","24","-46","+","31","20","D","-81"};
        System.out.println(new Baseball().calPoints(s));
    }
}
