import java.util.*;
import java.util.Map.*;

public class LongestSubstringWithoutRepetition {

    public static int getLongestSubstring(String str) {

        if(str == null || str.length() == 0) {
            return 0;
        }

        char[] chArr = str.toCharArray();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < chArr.length - 1; i++) {
            int left = i;
            int right = i + 1;
            HashSet<Character> chars = new HashSet<>();
            chars.add(chArr[left]);
            while(right < chArr.length) {
                if(chars.contains(chArr[right])) {
                    break;
                }
                chars.add(chArr[right]);
                right += 1;
            }
            map.put(left, right - left);
        }

        int max = Integer.MIN_VALUE;
        for(Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;

    }

    public static void main(String args[]) {

        String str = "abcabcbb";
        int length = getLongestSubstring(str);
        System.out.println("The Longest Substring Without Repetitions: " + length);

    }

}













