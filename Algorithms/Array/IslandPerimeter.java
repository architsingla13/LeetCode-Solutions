package Array;

/**
 * Author - archit.s
 * Date - 22/08/18
 * Time - 12:47 PM
 */
public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        int sum = 0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == 1){

                    sum+=4;
                    if(i-1>=0 && grid[i-1][j] == 1){
                        sum -= 1;
                    }
                    if(i+1<row && grid[i+1][j] == 1){
                        sum -= 1;
                    }
                    if(j-1>=0 && grid[i][j-1] == 1){
                        sum -= 1;
                    }
                    if(j+1<col && grid[i][j+1] == 1){
                        sum -= 1;
                    }
                }
            }
        }
        return sum;
    }
}
