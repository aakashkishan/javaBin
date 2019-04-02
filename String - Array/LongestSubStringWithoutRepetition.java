import java.util.*;

public class LongestSubStringWithoutRepetition {

    public static int findLongestSubString(String str) {

        int ptr_1 = 0;
        int ptr_2 = 0;
        int max_length = 0;
        HashSet<Character> hs = new HashSet<Character>();

        while(ptr_2 < str.length()) {

            if(!hs.contains(str.charAt(ptr_2))) {
                hs.add(str.charAt(ptr_2));
                ptr_2++;
                max_length = Math.max(max_length, ptr_2 - ptr_1);
            } else {
                hs.remove(str.charAt(ptr_1));
                ptr_1++;
            }

        }

        return max_length;

    }

    public static void main(String args[]) {

        String str = "aabcdfegdabc";
        int max_length = 0;
        max_length = findLongestSubString(str);

        System.out.println("Longest Sub-String: " + max_length);

    }

}


























