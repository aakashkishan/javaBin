import java.util.*;

public class RegexMatching {

    // Recursive Call for the regexMatch function
    public static boolean regexMatch(String str, String pattern) {

        if(pattern.length() == 0) {
            return str.length() == 0;
        }

        // Special Case
        if(pattern.length() == 1) {
            // If length of str is 0, then return false
            if(str.length() < 1) {
                return false;
            }

            // If the first character does not match, then return false
            else if((pattern.charAt(0) != str.charAt(0)) && (pattern.charAt(0) != '.')) {
                return false;
            }

            // Otherwise, compare the rest of the str and pattern
            else {
                return regexMatch(str.substring(1), pattern.substring(1));
            }
        }

        // Case 1: When the second character is not '*'
        if(pattern.charAt(1) != '*') {
            // If length of str is under 1, return false
            if(str.length() < 1) {
                return false;
            }

            if((pattern.charAt(0) != str.charAt(0)) && (pattern.charAt(0) != '.')) {
                return false;
            }

            // Otherwise, compare the rest of the strings str and pattern
            else {
                return regexMatch(str.substring(1), pattern.substring(1));
            }
        }

        // Case 2: When the second character of p is '*' - Complex Case
        else {
            // Case 2.1: A char & '*' can stand for 0 element
            if(regexMatch(str, pattern.substring(2))) {
                return true;
            }

            // Case 2.2: A char & '*' can stand for 1 or more preceding element
            int i = 0;
            while(i < str.length() && (str.charAt(i) == pattern.charAt(0) || pattern.charAt(0) == '.')) {
                if(regexMatch(str.substring(i+1), pattern.substring(2))) {
                    return true;
                }
                i += 1;
            }
            return false;
        }

    }

    public static void main(String args[]) {

        String str = "aab";
        String pattern = "c*a*b";
        boolean isMatch = false;
        isMatch = regexMatch(str, pattern);
        if(isMatch == true) {
            System.out.print("The Regex Strings Match!");
        } else {
            System.out.print("The Regex Strings are not a Match :(");
        }

    }

}