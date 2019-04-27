import java.util.*;

public class IsomorphicStrings {

    public static boolean checkIsomorphism(String str1, String str2) {

        if(str1 == null || str1.length() == 0 || str2 == null || str2.length() == 0) {
            return false;
        }

        if(str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Character> map1 = new HashMap<Character, Character>();
        HashMap<Character, Character> map2 = new HashMap<Character, Character>();

        for(int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if(map1.containsKey(c1)) {
                // If the c1 & c2 character's replacements are not Isomorphic
                if(c2 != map1.get(c1)) {
                    return false;
                }
            }
            // If the characters does not have a match in map1, 
            // but has one in map2 then these two strings are not isomorphic
            else if(map2.containsKey(c2)) {
                return false;
            }
            // If the characters are not matched yet, then match them in both maps
            else {
                map1.put(c1, c2);
                map2.put(c2, c1);
            }
        }

        return true;

    }

    public static void main(String args[]) {

        String str1 = "egg";
        String str2 = "add";
        boolean isIsomorphic = false;

        isIsomorphic = checkIsomorphism(str1, str2);
        if(isIsomorphic == true) {
            System.out.println("The Strings are Isomorphic!");
        } else {
            System.out.println("The Strings are not Isomorphics :(");
        }
    }

}































