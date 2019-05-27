// Objective  Minimum Path from Grid's Top Left to Bottom Right
import java.util.*;

public class MinimumSumPath {

    public static int minPathSum(int[][] grid) {
        return minStep(0, 0, grid);
    }
    
    public static int minStep(int i, int j, int[][] grid) {
        
        // Exit Case Case for the minStep
        if(i == grid.length - 1 && j == grid[0].length - 1) {
            return grid[i][j];
        }
        
        // In case of Intermediate Grid Cells
        if(i < grid.length - 1 && j < grid[0].length - 1) {
            int result1 = grid[i][j] + minStep(i + 1, j, grid);
            int result2 = grid[i][j] + minStep(i, j + 1, grid);
            return Math.min(result1, result2);
        }
        
        // In case of Boundary Grid Cells
        if(i < grid.length - 1) {
            return grid[i][j] + minStep(i + 1, j, grid);
        }
        
        if(j < grid[0].length - 1) {
            return grid[i][j] + minStep(i, j + 1, grid);
        }
        
        return 0;
        
    }

    public static void main(String args[]) {

        int[][] grid = new int[][] {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int min_path = minPathSum(grid);
        System.out.println("The Minimum Sum Path from Top Left and Bottom Right: " + min_path);

    }

}


























