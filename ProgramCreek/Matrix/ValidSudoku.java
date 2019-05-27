import java.util.*;

public class ValidSudoku {

    
    public static boolean isValidSudoku(char[][] board) {
        
        // 100000000 - The row/col/square contains a 9
        // 000000001 - The row/col/square contains a 1
        
        short[] rows = new short[9];
        short[] cols = new short[9];
        short[] squares = new short[9];
        
        int m = board.length;
        int n = board[0].length;
        for(int row = 0; row < m; row++) {
            for(int col = 0; col < n; col++) {
                
                if(board[row][col] == '.') {
                    continue;
                }
                
                short value = (short) (1 << (board[row][col] - '1'));
                // Check for the Row Condition
                if((value & rows[row]) > 0) {
                    return false;
                }
                // Check the Column Condition
                if((value & cols[col]) > 0) {
                    return false;
                }
                // Check the Square Condition
                if((value & squares[3 * (row/3) + col/3]) > 0) {
                    return false;
                }
                
                // Add the new Charcater to the respective row, col and square
                rows[row] |= value;
                cols[col] |= value;
                squares[3 * (row/3) + col/3] |= value;
                
            }
        }
        
        return true;
        
    }

    public static void main(String args[]) {

        char[][] board = new char[][] {
			{'8', '6', '.', '.', '2', '.', '.', '.', '.'},
			{'.', '.', '.', '7', '.', '.', '.', '5', '9'},
			{'.', '.', '.', '.', '.', '.', '.', '.', '.'},
			{'.', '.', '.', '.', '6', '.', '8', '.', '.'},
			{'.', '4', '.', '.', '.', '.', '.', '.', '.'},
			{'.', '.', '5', '3', '.', '.', '.', '.', '7'},
			{'.', '.', '.', '.', '.', '.', '.', '.', '.'},
			{'.', '2', '.', '.', '.', '.', '6', '.', '.'},
			{'.', '.', '7', '5', '.', '9', '.', '.', '.'}
        };
        boolean isValid = isValidSudoku(board);
        if(isValid == true) {
            System.out.println("The Sudoku Board is Valid!");
        }
        else {
            System.out.println("The Sudoku Board is not Valid :(");
        }

    }

}
































