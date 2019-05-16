import java.util.*;

public class LongestSubstringWithKDistinctCharacters {

    public static int lengthOfLongestSubstring(String str, int k) {

        int result = 0;
        int i = 0;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            // Pair Character with Occurence
            if(hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            }
            else {
                hm.put(ch, 1);
            }

            if(hm.size() <= k) {
                result = Math.max(result, j - i + 1);
            }
            else {
                while(hm.size() > k) {
                    char ch2 = str.charAt(i);
                    int count = hm.get(ch2);
                    if(count == 1) {
                        hm.remove(ch2);
                    }
                    else {
                        hm.put(ch2, hm.get(ch2) - 1);
                    }
                    i += 1;
                } 
            }
        }

        return result;

    }

    public static void main(String args[]) {

        String str = "abcadcacacaca";
        int k = 3;
        int length = lengthOfLongestSubstring(str, k);
        System.out.println("The length of the Longest Substring with K Distinct Characters: " + length);

    }

}
































