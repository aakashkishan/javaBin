import java.util.*;

public class LongestCommonPrefix {

    public static String findLongestCommonPrefix(String[] strs) {


        // Check for the case of null array or empty array
        if(strs == null || strs.length == 0) {
            return "";
        }

        String lcp = strs[0];

        // Loop through all the strings in the array
        for(int i = 1; i < strs.length; i++) {
            int j = 0;
            String str_curr = strs[i];

            // Increment 'j' until the characters between the previous and current strings do not match
            while(j < str_curr.length() && j < lcp.length() && lcp.charAt(j) == str_curr.charAt(j)) {
                j++;
            }

            // Null string check
            if(j == 0) {
                return "";
            }

            // Get the longest common prefix from the current iteration
            lcp = lcp.substring(0, j);

        }

        return lcp;

    }

    public static void main(String args[]) {

        String[] strs = new String[] {"aaa", "aab", "ab", "aa"};
        String result_lcp = new String();

        result_lcp = findLongestCommonPrefix(strs);
        System.out.println("the Longest Common Prefix: " + result_lcp);

    }

}




























