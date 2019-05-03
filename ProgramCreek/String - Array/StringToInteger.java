import java.util.*;

public class StringToInteger {

    public static int convertStringToInteger(String str) {

        // Null Check
        if(str == null || str.length() == 0) {
            return 0;
        }

        // Whitespacde Trim
        str = str.trim();
        char flag = '+'; // Flag to check the sign of the integer

        // Negative Check
        int i = 0;
        if(str.charAt(0) == '-') {
            flag = '-';
            i += 1;
        }
        else if(str.charAt(0) == '+') {
            flag = '+';
            i += 1;
        }

        double result = 0;
        // Calculate the value
        while(str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + (str.charAt(i) - '0');
            i += 1;
        }
        if(flag == '-') {
            result = -result;
        }

        // Max Integer and Min Integer Check
        if(result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        else if(result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) result;

    }

    public static void main(String args[]) {

        String str = " +12398";
        int result = 0;
        result = convertStringToInteger(str);
        System.out.print("String converted to Integer: " + result);

    }

}































