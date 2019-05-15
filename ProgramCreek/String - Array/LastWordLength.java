import java.util.*;

public class LastWordLength {

    public static int findLastWordLength(String str) {

        if(str == null || str.length() == 0) {
            return 0;
        }

        int result = 0;
        int length = str.length() - 1;
        boolean flag = false;
        for(int i = length; i >= 0; i--) {
            char ch = str.charAt(i);
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                flag = true;
                // Increment the length if current character is an alphabet
                result += 1;
            }
            else {
                if(flag == true) {
                    return result;
                }
            }
        }

        return result;

    }

    public static void main(String args[]) {

        String str = "Paypal is hirirg";
        int length = findLastWordLength(str);
        System.out.println("The length of the last word: " + length);

    }

}

























