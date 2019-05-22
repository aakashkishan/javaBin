import java.util.*;
import java.io.*;
import java.lang.*;

class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] arr = new int[n][n];
        
        // Base Condition
        if(n == 0) {
            return arr;
        }
        
        if(n == 1) {
            arr[0][0] = 1;
            return arr;
        }
        
        int length = n;
        int x = 0;
        int y = 0;
        int count = 0;
        while(count < (length * length)) {
                
            if(n == 1) {
                for(int i = 0; i < n; i++) {
                    arr[x][y++] = ++count;
                }
            }
            
            // Scan Left to Right
            if(count < length * length) {
                for(int i = 0; i < n-1; i++) {
                    arr[x][y++] = ++count;
                }
            }
            // Scan Top to Bottom
            if(count < length * length) {
                for(int i = 0; i < n-1; i++) {
                    arr[x++][y] = ++count;
                }
            }
            // Scan Right to Left
            if(count < length * length) {
                for(int i = 0; i < n-1; i++) {
                    arr[x][y--] = ++count;
                }
            }
            // Scan Bottom to Top
            if(count < length * length) {
                for(int i = 0; i < n-1; i++) {
                    arr[x--][y] = ++count;
                }
            }
            
            n -= 2;
            x += 1;
            y += 1;
            
        }
        
        return arr;
        
    }
}

public class SpiralMatrix {
    
    public static void main(String[] args) {
        int n = 3;
        
        int[][] ret = new Solution().generateMatrix(n);
        for(int i= 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(ret[i][j] + " ");
            }
        }
        
    }
}