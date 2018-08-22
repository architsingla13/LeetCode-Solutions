package Array;

import java.util.Stack;

/**
 * Author - archit.s
 * Date - 22/08/18
 * Time - 11:25 AM
 */
public class ToeplitzMatrix {

    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i !=0 && j!=0 && matrix[i][j] != matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }
}
