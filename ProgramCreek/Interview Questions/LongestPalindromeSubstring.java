import java.util.*;

public class LongestPalindromeSubstring {

    public static String getLongestPalindrome(String str) {

        if(str == null || str.length() == 0) {
            return null;
        }

        int len = str.length();
        int max_len = 1;
        boolean[][] dp = new boolean[len][len];

        String longest_palindrome = null;
        for(int l = 0; l < str.length(); l++) {
            for(int i = 0; i < len - l; i++) {
                int j = i + l;
                if(str.charAt(i) == str.charAt(j) && (j - i < 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    if(j - i + 1 < max_len) {
                        max_len = j - i + 1;
                        longest_palindrome = str.substring(i, j + 1);
                    }
                }
            }
        }

        return longest_palindrome;

    }

    public static void main(String args[]) {

        String str = "babad";
        String longest_palindrome = getLongestPalindrome(str);
        System.out.println("The Longest Palindrome: " + longest_palindrome);

    }

}





















