// Assumption: This is purely an alphabetical string

import java.util.*;

public class AltFindFirstUniqueCharacter {

    public static int findUniqueCharacter(String str) {

        if(str == null || str.length() == 0) {
            return -1;
        }

        int[] characterCounter = new int[26];

        for(int i = 0; i < str.length(); i++) {
            characterCounter[str.charAt(i) - 'a']++;
        }

        for(int i = 0; i < str.length(); i++) {
            if(characterCounter[str.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;

    }

    public static void main(String args[]) {

        String str = "leetcode";
        System.out.println("The First Unique character: " + str.charAt(findUniqueCharacter(str)));

    }

}





















