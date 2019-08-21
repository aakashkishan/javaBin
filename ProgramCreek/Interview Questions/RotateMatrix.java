import java.util.*;

public class RotateMatrix {

    public static void rotateMatrix(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return;
        }

        int n = matrix.length;
        for(int i = 0; i < n / 2; i++) {
            for(int j = i; j < n - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = temp;
            }
        }
        return;
    }

    public static void main(String args[]) {

        int[][] matrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateMatrix(matrix);
        System.out.println("The Rotated Matrix: ");
        for(int[] arr: matrix) {
            for(int i: arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}




