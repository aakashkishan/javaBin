import java.util.*;

public class MinimumWindowSubstring {

    static final int NO_OF_CHARS = 26;

    public static String getMinimumWindow(String str, String pat) {

        String result = "";
        if(str == null || pat == null) {
            return result;
        }

        int len1 = str.length();
        int len2 = pat.length();
        if(len1 < len2) {
            return result;
        }

        int[] string = new int[NO_OF_CHARS];
        int[] pattern = new int[NO_OF_CHARS];

        for(int i = 0; i < len2; i++) {
            pattern[pat.charAt(i) - 'A'] += 1;
        }

        int start = 0, start_index = -1, count = 0, min_length = Integer.MAX_VALUE;
        for(int j = 0; j < len1; j++) {

            string[str.charAt(j) - 'A'] += 1;
            if(string[str.charAt(j) - 'A'] <= pattern[str.charAt(j) - 'A'] && pattern[str.charAt(j) - 'A'] != 0) {
                count += 1;
            }

            if(count == len2) {
                while(string[str.charAt(start) - 'A'] > pattern[str.charAt(start) - 'A'] || pattern[str.charAt(start) - 'A'] == 0) {
                    if(string[str.charAt(start) - 'A'] > pattern[str.charAt(start) - 'A']) {
                        string[str.charAt(start) - 'A'] -= 1;
                    }
                    start += 1;
                }
                
                int temp_min = j - start + 1;
                if(temp_min < min_length) {
                    min_length = temp_min;
                    start_index = start;
                }
            }

        }

        if(start_index == -1) {
            return result;
        }

        result = str.substring(start_index, start_index + min_length);
        return result;

    }

    public static void main(String args[]) {

        String str = "ADOBECODEBANC";
        String pat = "ABC";
        String minimum_window = getMinimumWindow(str, pat);
        System.out.println("The Minimum Window Substring: " + minimum_window);

    }

}











