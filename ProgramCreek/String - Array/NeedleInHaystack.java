import java.util.*;

public class NeedleInHaystack {

    public static int findNeedle(String haystack, String needle) {

        if(needle.length() == 0 || needle == null || haystack == null || haystack.length() == 0) {
            return 0;
        }

        for(int i = 0; i < haystack.length(); i++) {
            if(i + needle.length() > haystack.length()) {
                return -1;
            }

            int temp = i;
            for(int j = 0; j < needle.length(); j++) {
                if(haystack.charAt(temp) == needle.charAt(j)) {
                    // If all characters are a match
                    if(j == needle.length() - 1) {
                        return i;
                    }
                    temp++;
                }
                else {
                    break;
                }
            }
        }

        return -1;

    }

    public static void main(String args[]) {

        String needle = "owo";
        String haystack = "helloworld";
        int index = -1;
        index = findNeedle(haystack, needle);
        if(index == -1) {
            System.out.print("No needle in haystack :(");
        }
        System.out.print("The Needle in the Haystack: " + index + "!");

    }

}





























