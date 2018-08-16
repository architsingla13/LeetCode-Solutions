package Array;

/**
 * Author - archit.s
 * Date - 16/08/18
 * Time - 11:40 PM
 */
public class Transpose {

    public int[][] transpose(int[][] A) {
        int col = A[0].length, row = A.length;
        int[][] result = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[j][i] = A[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
