import java.util.*;

public class OneEditDistance {

    public static boolean isOneEditDistance(String s, String t) {

        // Base Condition
        if(s == null || t == null || s.length() == 0 || t.length() == 0) {
            return false;
        }

        int m = s.length();
        int n = t.length();
        if(Math.abs(m - n) > 1) {
            return false;
        }
        int i = 0, j = 0, count = 0;
        while(i < m && j < n) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }
            else {
                count++;
                if(count > 1) {
                    return false;
                }
                if(m > n) {
                    i++;
                }
                else if(m < n) {
                    j++;
                }
                else {
                    i++;
                    j++;
                }
            }
        }

        if(i < m || j < n) {
            count++;
        }
        if(count == 1) {
            return true;
        }

        return false;

    }

    public static void main(String args[]) {

        String s = "geeks";
        String t = "geoks";
        boolean isOneEditMatch = isOneEditDistance(s, t);
        if(isOneEditMatch == true) {
            System.out.println("The String are One Edit Distance!");
        }
        else {
            System.out.println("The Strings are not One Edit Distance :(");
        }

    }

}






























