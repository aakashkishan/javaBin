import java.util.*;

public class NumberOfIslands {

    public static int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int len1 = grid.length;
        int len2 = grid[0].length;
        int count = 0;
        
        for(int i = 0; i < len1; i ++) {
            for(int j = 0; j < len2; j++) {
                if(grid[i][j] == '1') {
                    count += 1;
                    merge(grid, i , j);
                }
            }
        }
        
        return count;
    }
    
    public static void merge(char[][] grid, int i, int j) {
        int len1 = grid.length;
        int len2 = grid[0].length;
        
        if(i < 0 || i >= len1 || j < 0 || j >= len2 || grid[i][j] != '1') {
            return;
        }
        
        grid[i][j] = 'X';
        
        merge(grid, i-1, j);
        merge(grid, i+1, j);
        merge(grid, i, j-1);
        merge(grid, i, j+1);
    }

    public static void main(String args[]) {

        char[][] grid = new char[][] {{'1', '0', '1'}, {'1', '1', '0'}, {'1', '0', '1'}};
        int island_numbers = numIslands(grid);
        System.out.println("The Number of Islands: " + island_numbers);

    }

}




































