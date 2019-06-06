class Solution {
    public boolean exist(char[][] board, String word) {
        
        int m = board.length;
        int n = board[0].length;
        boolean result = false;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        
        return false;
        
    }
    
    public boolean dfs(char[][]board, String word, int i, int j, int ch_index) {
        
        int m = board.length;
        int n = board[0].length;
        if(i < 0 || i >= m || j < 0 || j >= n) {
            return false;
        }
        
        if(board[i][j] == word.charAt(ch_index)) {
            char temp = board[i][j];
            board[i][j] = '#';
            if(ch_index == word.length() - 1) {
                return true;
            }
            else if(dfs(board, word, i - 1, j, ch_index + 1)
                   || dfs(board, word, i + 1, j, ch_index + 1)
                   || dfs(board, word, i, j - 1, ch_index + 1)
                   || dfs(board, word, i, j + 1, ch_index + 1)) {
                return true;
            }
            board[i][j] = temp;
        }
        return false;
        
    }
}

public class WordSearch {

    public static void main(String args[]) {

        char[][] board = new char[][] {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        boolean isExists = new Solution().exist(board, word);
        if(isExists == true) {
            System.out.println("The Word exists in the Letter Board!");
        }
        else {
            System.out.println("The Word does not exist in the Letter Board :(");
        }

    }

}