import java.util.*;

public class LongestCommonPrefix {

    public static String findLongestCommonPrefix(String[] strs) {

        // Base Condition
        if(strs == null || strs.length == 0) {
            return "";
        }
        if(strs.length == 1) {
            return strs[0];
        }

        int i = 0;
        while(true) {
            boolean flag = true;
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].length() <= i || strs[j - 1].length() <= i ||
                    strs[j].charAt(i) != strs[j - 1].charAt(i)) {
                    flag = false;
                    break;
                }
            }

            if(flag == true) {
                i += 1;
            } 
            else {
                break;
            }
        }

        return strs[0].substring(0, i);

    }

    public static void main(String args[]) {

        String[] strs = new String[] {"flower", "flight", "flaw"};
        String common_prefix = findLongestCommonPrefix(strs);
        System.out.println("The Longest Common Prefix: " + common_prefix);

    }

}




















































