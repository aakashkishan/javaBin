// Objective - Unique Paths from start to end of a M x N Array
import java.util.*;

public class UniquePaths {

    public static int uniquePaths(int m, int n) {
        return pathStep(0, 0, m, n);   
    }
    
    public static int pathStep(int i, int j, int m, int n) {
        
        // Exit Condition
        if(i == m - 1 && j == n - 1) {
            return 1;
        }
        
        // Intermediate Cells
        if(i < m - 1 && j < n - 1) {
            return pathStep(i + 1, j, m, n) + pathStep(i, j + 1, m, n);
        }
        
        // Boundary Cells
        if(i < m - 1) {
            return pathStep(i + 1, j, m, n);
        }
        if(j < n - 1) {
            return pathStep(i, j + 1, m, n);
        }
        
        return 0;
        
    }

    public static void main(String args[]) {

        int m = 3;
        int n = 2;
        int unique_paths = uniquePaths(m , n);
        System.out.println("The Number of Unique Paths: " + unique_paths);

    }

}



























