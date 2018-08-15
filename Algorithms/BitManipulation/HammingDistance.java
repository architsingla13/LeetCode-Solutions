package BitManipulation;

/**
 * Author - archit.s
 * Date - 15/08/18
 * Time - 12:17 AM
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int distinct = x^y;
        while(true){
            if((distinct & 1) == 1){
                count++;
            }
            distinct = distinct>>1;
            if(distinct == 0){
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new HammingDistance().hammingDistance(1,4));
    }
}
