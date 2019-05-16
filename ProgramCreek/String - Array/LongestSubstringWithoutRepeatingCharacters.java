import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfSubstring(String str) {

        // Base Condition
        if(str == null || str.length() == 0) {
            return 0;
        }

        HashSet<Character> hs = new HashSet<Character>();
        int result = 1;
        int i = 0;
        for(int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            // In case of non-duplicate characters
            if(!hs.contains(ch)) {
                hs.add(ch);
                result = Math.max(result, hs.size());
            }
            else {
                while(i < j) {
                    if(str.charAt(i) == ch) {
                        i += 1;
                        break;
                    }
                    hs.remove(str.charAt(i));
                    i += 1;
                }
            }
        }

        return result;

    }

    public static void main(String args[]) {

        String str = "kwwepw";
        int length = lengthOfSubstring(str);
        System.out.println("The length of the longest substring without repeating characters: " + length);

    }

}






























