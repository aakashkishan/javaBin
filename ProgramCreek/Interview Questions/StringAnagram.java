import java.util.*;

public class StringAnagram {

    public static boolean checkAnagram(String str1, String str2) {
        if(str1 == null || str1.length() == 0 || str2 == null || str2.length() == 0) {
            return false;
        }

        if(str1.length() != str2.length()) {
            return false;
        }

        char[] chArr1 = str1.toCharArray();
        char[] chArr2 = str2.toCharArray();
        Arrays.sort(chArr1);
        Arrays.sort(chArr2);
        for(int i = 0; i < str1.length(); i++) {
            if(chArr1[i] != chArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {

        String str1 = "level";
        String str2 = "velle";
        boolean isAnagram = checkAnagram(str1, str2);
        if(isAnagram == true) {
            System.out.println("The Strings are Anagrams!");
        }
        else {
            System.out.println("The Strings are not Anagrams :(");
        }

    }

}








