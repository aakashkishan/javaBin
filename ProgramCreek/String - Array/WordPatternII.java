import java.util.*;

public class WordPatternII {

    public static boolean recursiveHelper(String pattern, String str, int i, int j, HashMap<Character, String> hm) {

        if(i == pattern.length() && j == str.length()) {
            return true;
        }
        if(i >= pattern.length() || j >= str.length()) {
            return false;
        }

        char ch = pattern.charAt(i);
        // Loop through to find a substring that satisfies the pattern (if any)
        for(int k = j + 1; k <= str.length(); k++) {
            // Generate all possible substrings to check for pattern match
            String sub = str.substring(j, k);
            if(!hm.containsKey(ch) && !hm.containsValue(sub)) {
                hm.put(ch, sub);
                // Return True if all helpers satisfy the pattern
                if(recursiveHelper(pattern, str, i + 1, k, hm) == true) {
                    return true;
                }
                hm.remove(ch);
            }
            else if(hm.containsKey(ch) && hm.get(ch).equals(sub)) {
                // If ch exists in the map, check if the corresponding string matches the sub
                // Return True if all helpers satisfy the pattern
                if(recursiveHelper(pattern, str, i + 1, k, hm) == true) {
                    return true;
                }
            }
        }
        
        return false;

    }

    public static boolean wordPattern(String pattern, String str) {

        // Base Conditions
        if(pattern.length() == 0 && str.length() == 0) {
            return true;
        }
        if(pattern.length() == 0) {
            return false;
        }

        HashMap<Character, String> hm = new HashMap<>();
        return recursiveHelper(pattern, str, 0, 0, hm);

    }

    public static void main(String args[]) {

        String pattern = "abba";
        String str = "dogcatcatdog";
        boolean isMatch = wordPattern(pattern, str);
        if(isMatch == true) {
            System.out.println("The String is a Match for the Pattern!");
        }
        else {
            System.out.println("The String is not a Match for the Pattern :(");
        }

    }

}


























