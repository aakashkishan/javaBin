import java.util.*;

public class ValidAnagram {

    public static boolean anagramValid(String str1, String str2) {

        if(str2.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        // Set a count of character occurences into the hash map
        for(int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for(int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if(map.containsKey(ch)) {
                if(map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }

        // If the map is empty, then the strings are anagrams
        if(map.size() != 0) {
            return false;
        }

        return true;
 
    }

    public static void main(String args[]) {

        String str1 = new String("helloworld");
        String str2 = new String("werlllhood");

        boolean isAnagram = anagramValid(str1, str2);
        if(isAnagram == true) {
            System.out.println("The Strings are Anagrams!");
        } else {
            System.out.println("The Strings are not Anagrams :(");
        }

    }

}



























