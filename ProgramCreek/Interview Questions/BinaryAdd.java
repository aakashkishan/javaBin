import java.util.*;

import static java.lang.Character.getNumericValue;

import java.lang.*;

public class BinaryAdd {

    public static String getBinarySum(String str1, String str) {

        if(str1 == null && str == null) {
            return null;
        }

        int carry = 0;
        char[] arr;
        String str2 = "";
        int i = 0;

        if(str1.length() >= str.length()) {
            char[] str2_arr = new char[str1.length()];
            int diff = str1.length() - str.length();
            char[] chArr = str.toCharArray();
            for(int j = str.length() - 1; j >= 0; j--) {
                str2_arr[j + diff] = chArr[j];
            }
            for(int k = 0; k < diff; k++) {
                str2_arr[k] = '0';
            }
            str2 = new String(str2_arr);
            i = str1.length() - 1;
            arr = new char[str1.length() + 1];
        }
        else {
            char[] str1_arr = new char[str.length()];
            int diff = str.length() - str1.length();
            char[] chArr = str1.toCharArray();
            for(int j = str1.length() - 1; j >= 0; j--) {
                str1_arr[j + diff] = chArr[j];
            }
            for(int k = 0; k < diff; k++) {
                str1_arr[k] = '0';
            }
            str2 = new String(str1_arr);
            i = str2.length() - 1;
            arr = new char[str2.length() + 1];
        }

        while(i >= 0) {
            if (carry + getNumericValue(str1.charAt(i)) + getNumericValue(str2.charAt(i)) == 2) {
                arr[i + 1] = '0';
                carry = 1;
            } else if (carry + getNumericValue(str1.charAt(i)) + getNumericValue(str2.charAt(i)) == 3) {
                arr[i + 1] = '1';
                carry = 1;
            } else {
                arr[i + 1] = '1';
                carry = 0;
            }
            i -= 1;
        }

        if(carry != 0) {
            arr[0] = Integer.toString(carry).charAt(0);
        }

        return new String(arr) ;

    }

    public static void main(String args[]) {

        String str1 = "11", str2 = "01";
        String sum_str = getBinarySum(str1, str2);
        System.out.println("The Binary Sum: " + sum_str);

    }

}
















