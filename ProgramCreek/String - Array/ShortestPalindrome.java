import java.util.*;

public class ShortestPalindrome {

    public static String shortestPalindrome(String str) {

        // Base Condition
        if(str == null || str.length() == 0) {
            return "";
        }

        int left = 0; // Left Pointer
        int right = str.length() - 1; // Right Pointer
        // Iterate until a palindrome unit is fine
        while(right >= 0) {
            if(str.charAt(left) == str.charAt(right)) {
                left += 1;
            }
            right -= 1;
        }

        if(left == str.length()) {
            return str;
        }

        // Obtain the un-palindromized unit
        String suffix = str.substring(left);
        String prefix = new StringBuilder(suffix).reverse().toString();
        String middle = shortestPalindrome(str.substring(0, left));
        return prefix + middle + suffix;

    }

    public static void main(String args[]) {

        String str = "abcd";
        String result_palindrome = shortestPalindrome(str);
        System.out.println("The Shortest Palindrome: " + result_palindrome);

    }

}



























