import java.util.*;

public class ScrambleStrings {

    public static boolean isScramble(String s1, String s2) {
        
        if(s1.length() != s2.length()) {
            return false;
        }
        
        // Recursion Exit Condition
        if(s1.length() == 0 || s1.equals(s2)) {
            return true;
        }
        
        // Check for non-similar characters
        char[] chArr1 = s1.toCharArray();
        char[] chArr2 = s2.toCharArray();
        Arrays.sort(chArr1);
        Arrays.sort(chArr2);
        if(!new String(chArr1).equals(new String(chArr2))) {
            return false;
        }
        
        for(int i = 1; i < s1.length(); i++) {
            String s11 = s1.substring(0, i);
            String s12 = s1.substring(i);
            String s21 = s2.substring(0, i);
            String s22 = s2.substring(i);
            String s23 = s2.substring(0, s2.length() - i);
            String s24 = s2.substring(s2.length() - i);
            
            if(isScramble(s11, s21) && isScramble(s12, s22)) {
                return true;
            }
            if(isScramble(s11, s24) && isScramble(s12, s23)) {
                return true;
            }
        }
        
        return false;
         
    }

    public static void main(String args[]) {

        String s1 = "great";
        String s2 = "rgtae";
        boolean isScrambled = isScramble(s1, s2);
        if(isScrambled == true) {
            System.out.println("The Strings are Scrambled!");
        }
        else {
            System.out.println("The Strings are not Scrambled :(");
        }

    }

}
































