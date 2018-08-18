package BitManipulation;

/**
 * Author - archit.s
 * Date - 18/08/18
 * Time - 6:07 PM
 */
public class Complement {

    public int findComplement(int num) {
        int count = 0;
        int original = num;
        while (original > 0){
            original = original/2;
            count++;
        }

        int temp = -1;
        temp = temp << count;

        return temp^~num;
    }

    public static void main(String[] args) {

        System.out.println(new Complement().findComplement(1));
    }

}
