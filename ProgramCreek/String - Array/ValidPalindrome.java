import java.util.*;

public class ValidPalindrome {

    public static boolean checkValidPalindrome(String str) {

        str = str.trim();
        // Null Check
        if(str == null || str.length() == 0) {
            return false;
        }

        str = str.toLowerCase();
        int i = 0;
        int j = str.length() - 1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;

    }

    public static void main(String args[]) {

        String str = "Redrum siris murder";
        boolean isPalindrome = false;
        isPalindrome = checkValidPalindrome(str);
        if(isPalindrome == true) {
            System.out.println("It is a Palindrome!");
        } else {
            System.out.println("It is not a Palindrome :(");
        }

    }

}































