import java.util.*;

public class WordBreak {

    public static boolean findWordBreak(String str, List<String> word_list) {

        // These boolean values represent whether a word break exists until that index
        boolean[] isWordBreak = new boolean[str.length() + 1];

        isWordBreak[0] = true;

        for(int i = 0; i < str.length() + 1 ; i++) {
            for(int j = 0; j < i; j++) {
                // Loop through j until you find a true word break
                if(!isWordBreak[j]) {
                    continue;
                }

                // If there is an existing word break, check for possible word breaks from j to i
                if(word_list.contains(str.substring(j, i))) {
                    isWordBreak[i] = true;
                    break;
                }
            }
        }

        return isWordBreak[str.length()];

    }

    public static void main(String args[]){

        String str = "leetcode";
        List<String> word_list = new ArrayList<String>();
        word_list.add("lee");
        word_list.add("code");
        word_list.add("tcod");
        word_list.add("eet");
        word_list.add("l");
        boolean isPossible = false;

        isPossible = findWordBreak(str, word_list);
        if(isPossible == true) {
            System.out.println("Word Break Exists");
        } else {
            System.out.println("Word Break does not Exist");
        }

    }

}


























