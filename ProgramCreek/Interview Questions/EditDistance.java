import java.util.*;

public class EditDistance {

    public static String longestCommonSubString(String str1, String str2) {

        char[] chArr = str1.toCharArray();
        ArrayList<String> sub_strings = new ArrayList<>();
        for(int i = 0; i < str1.length(); i++) {
            for(int j = i + 1; j < str1.length(); j++) {
                String sub_str = str1.substring(i, j);
                sub_strings.add(sub_str);
            }
        }

        int max = 0;
        String max_string = "";
        for(String sub_str: sub_strings) {
            if(str2.contains(sub_str)) {
                if(sub_str.length() > max) {
                    max = sub_str.length();
                    max_string = sub_str;
                }
            }
        }

        return max_string;

    }

    public static void main(String args[]) {

        String str1 = "abcd";
        String str2 = "dabc";
        String sub_str = longestCommonSubString(str1, str2);
        System.out.println("The Longest Common Substring: " + sub_str);

    }

}












