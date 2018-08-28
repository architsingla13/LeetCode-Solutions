package Array;

/**
 * Author - archit.s
 * Date - 27/08/18
 * Time - 10:25 PM
 */
public class SurfaceArea {

    public int surfaceArea(int[][] grid) {

        int result = 0;
        int row = grid.length;
        int col = grid[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                if(grid[i][j] > 0){
                    result += 6 + (grid[i][j]-1)*4;
                }
                if(i-1>=0){
                    int min = Math.min(grid[i-1][j], grid[i][j]);
                    result -= min;
                }
                if(j+1<col){
                    int min = Math.min(grid[i][j+1], grid[i][j]);
                    result -= min;
                }
                if(j-1>=0){
                    int min = Math.min(grid[i][j-1], grid[i][j]);
                    result -= min;
                }
                if(i+1<row){
                    int min = Math.min(grid[i+1][j], grid[i][j]);
                    result -= min;
                }
            }
        }

        return result;
    }

}
