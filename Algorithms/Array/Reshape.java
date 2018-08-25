package Array;

/**
 * Author - archit.s
 * Date - 24/08/18
 * Time - 12:50 PM
 */
public class Reshape {

    public int[][] matrixReshape(int[][] nums, int r, int c) {

        int[][] result = new int[r][c];

        int rows = nums.length, col = nums[0].length;

        if(r*c != rows*col){
            return nums;
        }

        int i1 = 0, j1 = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                result[i][j] = nums[i1][j1];
                j1++;
                if(j1 >= col){
                    j1= 0;
                    i1++;
                }
            }
        }

        return result;

    }


//  Alternate solution using Division & Modulus
//  public int[][] matrixReshape(int[][] nums, int r, int c) {
//
//        int[][] result = new int[r][c];
//
//        int rows = nums.length, col = nums[0].length;
//
//        if(r*c != rows*col){
//            return nums;
//        }
//
//      int count = 0;
//      for (int i = 0; i < nums.length; i++) {
//          for (int j = 0; j < nums[0].length; j++) {
//              result[count / c][count % c] = nums[i][j];
//              count++;
//          }
//      }
//
//        return result;
//
//    }

}
