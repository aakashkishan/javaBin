import java.util.*;

public class WildcardPatternMatching {

    public static boolean findMatch(String str, String pattern) {

        boolean isMatch = false;
        if(str == null || str.length() == 0 || pattern == null || pattern.length() == 0) {
            return isMatch;
        }

        int i = 0, j = 0;
        int star_index = -1, curr_index = -1;
        while(i < str.length()) {
            // Increment i and j if the pattern is ? or if the character is a match
            if(j < pattern.length() && (pattern.charAt(j) == '?' || pattern.charAt(j) == str.charAt(i))) {
                i += 1;
                j += 1;
            }
            // If pattern is a *, then mark the position of the star and also increment j
            else if(j < pattern.length() && pattern.charAt(j) == '*') {
                star_index = j;
                curr_index = i;
                j += 1;

            }
            else if(star_index != -1) {
                j = star_index + 1;
                i = curr_index;
                curr_index += 1;
            } else {
                return isMatch;
            }
        }

        while(j < pattern.length() && pattern.charAt(j) == '*') {
            j += 1;
        }

        isMatch = j == pattern.length() ? true : false;
        return isMatch;

    }

    public static void main(String args[]) {

        String str = "abaab";
        String pattern = "*ab";
        boolean isMatch = false;
        isMatch = findMatch(str, pattern);
        if(isMatch == true) {
            System.out.print("The String matches the Pattern");
        } else {
            System.out.print("the String does not match the Pattern");
        }

    }

}































