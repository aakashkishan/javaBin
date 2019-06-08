class NumMatrix {

    int[][] sum;
    
    public NumMatrix(int[][] matrix) {
        
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        sum = new int[m][n];
        
        for(int i = 0; i < m; i++) {
            int row_sum = 0;
            for(int j = 0; j < n; j++) {
                if(i == 0) {
                    row_sum += matrix[i][j];
                    sum[i][j] = row_sum;
                }
                else {
                    row_sum += matrix[i][j];
                    sum[i][j] = row_sum + sum[i-1][j];
                }
            }
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        
        if(this.sum == null) {
            return 0;
        }
        
        int top_right_x = row1;
        int top_right_y = col2;
        int bottom_left_x = row2;
        int bottom_left_y = col1;
            
        int result = 0;
 
        if(row1 == 0 && col1 == 0){
            result = sum[row2][col2];
        }else if(row1 == 0){
            result = sum[row2][col2]
                    - sum[bottom_left_x][bottom_left_y - 1];
 
        }else if(col1 == 0){
            result = sum[row2][col2]
                    - sum[top_right_x - 1][top_right_y];
        }else{
            result = sum[row2][col2]
                    - sum[top_right_x - 1][top_right_y]
                    - sum[bottom_left_x][bottom_left_y - 1]
                    + sum[row1 - 1][col1 - 1];
        }
 
        return result; 
        
    }
}



public class RangeSumQuery2D {

    public static void main(String args[]) {

        int[][] matrix = new int[][] {{3, 0, 1, 4}, {5, 6, 3, 2}, {1, 2, 0, 1}, {4, 1, 0, 1}};
        int row1 = 0, col1 = 2, row2 = 3, col2 = 3;
        int sum_region = new NumMatrix(matrix).sumRegion(row1, col1, row2, col2);
        System.out.println("The Sum in the Region: " + sum_region);

    }

}













