package Math;

/**
 * Author - archit.s
 * Date - 15/08/18
 * Time - 3:09 PM
 */
public class Projection {

    public int projectionArea(int[][] grid) {
        int xyArea = 0;
        int zxArea = 0;
        int yzArea = 0;

        for (int i = 0; i < grid.length; i++) {
            int zxMax = 0;
            int zyMax = 0;
            for (int j = 0; j < grid[0].length; j++) {

                if(grid[i][j] != 0){
                    xyArea ++;
                }
                if(zxMax < grid[i][j]){
                    zxMax = grid[i][j];
                }
                if(zyMax < grid[j][i]){
                    zyMax = grid[j][i];
                }
            }
            zxArea += zxMax;
            yzArea += zyMax;
        }

        return zxArea + yzArea + xyArea;
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 2},
                {3, 4}
        };

        System.out.println(new Projection().projectionArea(a));
    }
}
