package BinarySearch;

/**
 * Author - archit.s
 * Date - 15/08/18
 * Time - 7:59 PM
 */
public class PeakMountain {

    public int peakIndexInMountainArray(int[] A) {
        int low = 0;
        int high = A.length - 1;
        int counter = low + (high-low)/2;

        while (low<=high){
            if(A[counter] > A[counter-1] ){
                if(A[counter] > A[counter+1]){
                    return counter;
                }
                else {
                    low = counter+1;
                }
            }
            else {
                high = counter-1;
            }
            counter = low + (high-low)/2;
        }

        return counter;
    }

    public static void main(String[] args) {
        int[] A = {0,1,0};
        System.out.println(new PeakMountain().peakIndexInMountainArray(A));
    }
}
