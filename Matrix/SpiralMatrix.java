import java.util.*;

public class SpiralMatrix {

    public static ArrayList<Integer> spiralSequence(int[][] matrix) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0) {
            return result;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int x = 0;
        int y = 0;
        while(rows > 0 && cols > 0) {

            // No Spiral can be formed if only one row or col
            if(rows == 1) {
                for(int i = 0; i < cols; i++) {
                    // Prints all the column elements
                    result.add(matrix[x][y++]);
                }
                break;
            } else if(cols == 1) {
                for(int j = 0; j < cols; j++) {
                    // Prints all the row elements
                    result.add(matrix[x++][y]);
                }
                break;
            }

            // If no single column or row, then row is possible

            // Move Top-Right
            for(int i = 0; i < cols - 1; i++) {
                result.add(matrix[x][y++]);
            }

            // Move Bottom-Right
            for(int i = 0; i < rows - 1; i++) {
                result.add(matrix[x++][y]);
            }

            // Move Bottom-Left
            for(int i = 0; i < cols - 1; i++) {
                result.add(matrix[x][y--]);
            }

            // Move Top-Left
            for(int i = 0; i < rows - 1; i++) {
                result.add(matrix[x--][y]);
            }

            // We have now completed one circle, to complete the spiral, 
            // we have to continue further into the array
            rows = rows - 2;
            cols = cols - 2;
            x += 1;
            y += 1;

        }

        return result;

    }

    public static void main(String args[]) {

        int[][] matrix = new int[][] {{1, 2, 3},
                                        {4, 5, 6},
                                        {7, 8, 9}};

        ArrayList<Integer> result_seq = new ArrayList<Integer>();
        result_seq = spiralSequence(matrix);

        System.out.println("Original Matrix: ");
        for(int i = 0; i < matrix[0].length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Spiral Matrix: ");
        for(int i = 0; i < result_seq.size(); i += 3) {
            System.out.print(result_seq.get(i) + " " + result_seq.get(i+1) + " " + result_seq.get(i+2));
            System.out.println();
        }

    }

}




























