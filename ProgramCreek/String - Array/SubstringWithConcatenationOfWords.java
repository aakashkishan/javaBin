import java.util.*;

public class SubstringWithConcatenationOfWords {

    public static ArrayList<Integer> substringOfWords(String str, String[] words) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        if(str == null || str.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        // Frequence of Words
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(String s: words) {
            if(hm.containsKey(s)) {
                hm.put(s, hm.get(s) + 1);
            }
            else {
                hm.put(s, 1);
            }
        }

        int word_length = words[0].length();
        for(int j = 0; j < word_length; j++) {

            HashMap<String, Integer> curr_map = new HashMap<String, Integer>();
            int start = j; // Start index of start
            int count = 0; // Count the qualified words
            for(int i = j; i <= str.length() - word_length; i = i + word_length) {
                String sub = str.substring(i, i + word_length);
                if(hm.containsKey(sub)) {
                    // Set Frequence of sub in Current Map
                    if(curr_map.containsKey(sub)) {
                        curr_map.put(sub, curr_map.get(sub) + 1);
                    }
                    else {
                        curr_map.put(sub, 1);
                    }
                    count += 1;

                    while(curr_map.get(sub) > hm.get(sub)) {
                        String left = str.substring(start, start + word_length);
                        curr_map.put(left, curr_map.get(left) - 1);
                        count -= 1;
                        start += word_length;
                    }

                    if(words.length == count) {
                        result.add(start); // Add the start index to result
                        // Shift right and reset current map, count & start point
                        String left = str.substring(start, start + word_length);
                        curr_map.put(left, curr_map.get(left) - 1);
                        count -= 1;
                        start += word_length;
                    }
                }
                // If the map does not contains the substring
                else {
                    // Reset the various variables
                    curr_map.clear();
                    start = i + word_length;
                    count = 0;
                }
            }

        }

        return result;

    }

    public static void main(String args[]) {

        String str = "barfoothefoobarman";
        String[] words = new String[] {"foo", "bar"};
        ArrayList<Integer> result = substringOfWords(str, words);
        System.out.println("The Index of the Words Concatenation Occurence: ");
        for(int i: result) {
            System.out.print(i + " ");
        }

    }

}



























