import java.util.*;

public class MinimumWindowSubstring {

    public static String findWindow(String str, String target) {

        HashMap<Character, Integer> goal = new HashMap<Character, Integer>();
        int goal_size = target.length();
        int min_length = Integer.MAX_VALUE;
        String result = "";

        // The target dictionary 
        for(int k = 0; k < target.length(); k++) {
            goal.put(target.charAt(k), goal.getOrDefault(target.charAt(k), 0) + 1);
        }

        int start = 0; // start index of the window
        int total = 0; // Check for the target characters in substring
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(int i = 0; i < str.length(); i++) {

            // In case of character not in goal
            char ch = str.charAt(i);
            if(!goal.containsKey(ch)) {
                continue;
            }

            // In case of target character in goal, and current count of character in string < goal
            int count = hm.getOrDefault(ch, 0);
            if(count < goal.get(ch)) {
                // If the target character in string, increase the target character check [total]
                total += 1;
            }
            hm.put(ch, count + 1);

            // When total reaches the goal size, trim from left for the minimum window
            if(total == goal_size) {
                // In case window start character not in goal OR occurence of start character greater in hm than goal
                while(!goal.containsKey(str.charAt(start)) || hm.get(str.charAt(start)) > goal.get(str.charAt(start))) {
                    char start_ch = str.charAt(start);
                    if(goal.containsKey(start_ch) && hm.get(start_ch) > goal.get(start_ch)) {
                        hm.put(start_ch, hm.get(start_ch) - 1);
                    }
                    start += 1;
                }

                if(min_length > i - start + 1) {
                    min_length = i - start + 1;
                    result = str.substring(start, i + 1);
                }
            }

        }

        return result;

    }

    public static void main(String args[]) {

        String str = "ADOBECODEBANC";
        String target = "ABC";
        String window = findWindow(str, target);
        System.out.println("The Minimum Window Substring: " + window);

    }

}



























