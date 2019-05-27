// Objective - Find the number of Unique Paths from Top Left to Bottom Right with Obstacles in between.
import java.util.*;

public class UniquePathsWithObstacles {

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        if(obstacleGrid == null || obstacleGrid.length == 0) {
            return 0;
        }
        
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }
        
        int[][] paths = new int[m][n];
        paths[0][0] = 1;
        
        // Left Column
        for(int i = 1; i < m; i++) {
            if(obstacleGrid[i][0] == 1) {
                paths[i][0] = 0;
            }
            else {
                paths[i][0] = paths[i - 1][0];
            }
        }
        
        // Top Row
        for(int j = 1; j < n; j++) {
            if(obstacleGrid[0][j] == 1) {
                paths[0][j] = 0;
            }
            else {
                paths[0][j] = paths[0][j - 1];
            }
        }
        
        // Fill Cells 
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if(obstacleGrid[i][j] == 1) {
                    paths[i][j] = 0;
                }
                else {
                    paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
                }
            }
        }
        
        return paths[m - 1][n - 1];
        
    }

    public static void main(String args[]) {

        int[][] obstacleGrid = new int[][] {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int unique_paths = uniquePathsWithObstacles(obstacleGrid);
        System.out.println("The Number of Unique Paths for MxN Matrix with ObstacleS: " + unique_paths);

    }

}































