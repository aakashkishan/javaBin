import java.util.*;

class Solution {
    public void solve(char[][] board) {
        
        if(board == null || board.length == 0 || board[0].length == 0) {
            return;
        } 
        
        int m = board.length;
        int n = board[0].length;
        // Corner Rows & Columns
        for(int j = 0; j < n; j++) {
            if(board[0][j] == 'O') {
                neighbourNonZero(board, 0, j);
            }
        }
        
        for(int i = 0; i < m; i++) {
            if(board[i][n - 1] == 'O') {
                neighbourNonZero(board, i, n - 1);
            }
        }
        
        for(int j = n - 1; j >= 0; j--) {
            if(board[m - 1][j] == 'O') {
                neighbourNonZero(board, m - 1, j);
            }
        }
        
        for(int i = m - 1; i >= 0; i--) {
            if(board[i][0] == 'O') {
                neighbourNonZero(board, i, 0);
            }
        }
        
        // Internal Rows & Columns
        for(int i = 1; i < m - 1; i++) {
            for(int j = 1; j < n - 1; j++) {
                if(board[i][j] == 'O') {
                    neighbourZero(board, i, j);
                }
            }
        }
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == '#') {
                    board[i][j] = 'X';
                }
                else if(board[i][j] == '*') {
                    board[i][j] = 'O';
                }
            }
        }
        
    }
    
    public void neighbourNonZero(char[][] board, int i, int j) {
        
        int m = board.length;
        int n = board[0].length;
        
        if(i < 0 || i >= m || j < 0 || j >= n || board[i][j] != 'O') {
            return;
        }
        
        board[i][j] = '*';
        neighbourNonZero(board, i - 1, j);
        neighbourNonZero(board, i + 1, j);
        neighbourNonZero(board, i, j - 1);
        neighbourNonZero(board, i, j + 1);
        
    }
    
    public void neighbourZero(char[][] board, int i, int j) {
        
        int m = board.length;
        int n = board[0].length;
        
        if(i < 1 || i >= m- 1 || j < 1 || j >= n - 1 || board[i][j] != 'O') {
            return;
        }
        
        board[i][j] = '#';
        neighbourZero(board, i - 1, j);
        neighbourZero(board, i + 1, j);
        neighbourZero(board, i, j - 1);
        neighbourZero(board, i, j + 1);
        
    }
}

public class SurroundedRegions {

    public static void main(String args[]) {

        char[][] board = new char[][] {{'X', 'X', 'X', 'X'}, 
                                        {'X', 'O', 'O', 'X'}, 
                                        {'X', 'X', 'O', 'X'}, 
                                        {'O', 'O', 'X', 'X'}};

        new Solution().solve(board);
        System.out.println("The Surrounded Regions [flooded regions]: ");
        for(char[] chArr : board) {
            for(char ch : chArr) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }

}











