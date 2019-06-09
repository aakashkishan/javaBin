import java.util.*;

class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        int[] max = new int[1];
        
        for(int i = 0 ; i < m; i++) {
            for(int j = 0; j < n; j++) {
                dfs(i, j, matrix, max, 0, Integer.MIN_VALUE);
            }
        }
        
        return max[0];
        
    }
    
    public void dfs(int i, int j, int[][] matrix, int[] max, int length, int prev_value) {
        
        max[0] = Math.max(max[0], length);
        int m = matrix.length;
        int n = matrix[0].length;
        
        if(i < 0 || i >= m || j < 0 || j >= n || matrix[i][j] <= prev_value) {
            return;
        }
        
        dfs(i - 1, j, matrix, max, length + 1, matrix[i][j]);
        dfs(i, j - 1, matrix, max, length + 1, matrix[i][j]);
        dfs(i + 1, j, matrix, max, length + 1, matrix[i][j]);
        dfs(i, j + 1, matrix, max, length + 1, matrix[i][j]);
        
    }
}


public class LongestIncreasingPath {

    public static void main(String args[]) {

        int[][] matrix = new int[][] {{9, 9, 4}, {6, 6, 8}, {2, 1, 1}};
        int longest_increasing_path = new Solution().longestIncreasingPath(matrix);
        System.out.println("The Longest Increasing Path: " + longest_increasing_path);

    }

}


















