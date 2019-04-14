import java.util.*;

public class ToeplitzMatrix {

    public static boolean checkToeplitz(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(i + 1 < rows && j + 1 < cols && matrix[i][j] != matrix[i+1][j+1]) {
                    return false;
                }
            }
        }

        return true;

    }

    public static void main(String args[]) {

        int[][] matrix = new int[][] {{1, 2, 3},
                                        {4, 1, 2},
                                        {5, 4, 1}};

        boolean isToeplitz = checkToeplitz(matrix);
        if(isToeplitz == true) {
            System.out.println("The matrix is a Toeplitz!");
        } else {
            System.out.println("The matrix is not a Toeplitz :(");
        }

    }

}


























