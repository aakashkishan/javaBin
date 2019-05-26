import java.util.*;

public class SearchAMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        
        // Base Condition
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n - 1;
        
        while(left <= right) {
            int mid = (left + right) / 2;
            int midX = mid / n;
            int midY = mid % n;
            
            if(matrix[midX][midY] == target) {
                return true;
            }
            
            if(matrix[midX][midY] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
     
    return false;
        
    }

    public static void main(String args[]) {

        int[][] matrix = new int[][] {{1, 3, 5, 7}, {10, 11, 16, 18}, {22, 23, 25, 29}};
        int target = 16;
        boolean isThere = searchMatrix(matrix, target);
        if(isThere == true) {
            System.out.println("Search target is Available!");
        }
        else {
            System.out.println("Search target is not Available :(");
        }
    
    }

}
























