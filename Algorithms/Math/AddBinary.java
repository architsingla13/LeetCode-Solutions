package Math;

/**
 * Author - archit.s
 * Date - 26/09/18
 * Time - 11:08 PM
 */
public class AddBinary {

    public String addBinary(String a, String b) {

        StringBuilder s = new StringBuilder();
        int carry = 0;

        int minLength;
        String small, big;

        if(a.length() >= b.length() ){
            small = b;
            big = a;
            minLength = b.length();
        }
        else{
            small = a;
            big = b;
            minLength = a.length();
        }

        for(int i=minLength-1; i>=0; i--){

            int count1 = small.charAt(i) == '1' ? 1 : 0;
            count1 += big.charAt(big.length() - minLength +  i ) == '1' ? 1 : 0;
            count1 += carry;

            if(count1 == 2){
                carry = 1;
                s.insert(0, 0);
            }
            else if(count1 == 3){
                carry = 1;
                s.insert(0,1);
            }
            else{
                carry = 0;
                s.insert(0,count1);
            }
        }

        int j = big.length() - small.length()-1;

        while(j>=0 || carry == 1){
            if(j>=0){
                int count1 = carry;
                count1 += big.charAt(j) == '1' ? 1 : 0;

                if(count1 == 2){
                    carry = 1;
                    s.insert(0, 0);
                }
                else{
                    carry = 0;
                    s.insert(0,count1);
                }
                j--;
            }
            else{
                s.insert(0,carry);
                carry=0;
            }
        }

        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(new AddBinary().addBinary("100", "110010"));

    }
}
