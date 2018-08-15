package Array;

/**
 * Author - archit.s
 * Date - 15/08/18
 * Time - 12:29 AM
 */
public class FlippingImage {

    public int[][] flipAndInvertImage(int[][] A) {
        int row = A.length;

        for(int i=0;i<row;i++){
            int column = A[i].length;

            for (int j=0;j<(column+1)/2;j++){
                int leftSide = A[i][j];
                int rightSide = A[i][column-j-1];

                A[i][j] = rightSide ^ 1;
                A[i][column - j -1] = leftSide ^ 1;
            }
        }

        return A;
    }

    public static void main(String[] args) {
        int[][] a = {
                {1},
                {1, 1},
                {0, 0, 0},
        };
        final int[][] image = new FlippingImage().flipAndInvertImage(a);

        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length; j++){
                System.out.print(image[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println();
    }
}
