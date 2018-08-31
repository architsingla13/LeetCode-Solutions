package BitManipulation;

/**
 * Author - archit.s
 * Date - 30/08/18
 * Time - 11:55 AM
 */
public class AlternatingBits {

    public boolean hasAlternatingBits(int n) {
        if(n == 0){
            return false;
        }

        int flip = 0;
        if((n & 1) == 1){
            flip = 1;
        }
        while(n !=0 ){
            int temp = n & 1;
            if(flip == 1){
                if(temp != 1){
                    flip = -1;
                    break;
                }
                else{
                    flip = 0;
                }
            }
            else{
                if(temp != 0){
                    flip = -1;
                    break;
                }
                else{
                    flip = 1;
                }
            }
            n = n>>1;
        }

        return flip != -1;
    }
}
