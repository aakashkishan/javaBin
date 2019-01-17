/* Objective - Reverse an Array without affecting any special characters 
   Example - Inout : str = "a,b$c"
             Output : str = "c,b$a" */

import java.lang.*;
import java.io.*;
import java.util.*;

public class reverseArray {

    public static void main(String args[]) {

        String str = "Ab,c,de!$";
        System.out.println("Reverse String except Special Characters : " + reverseString(str));

    }

    public static String reverseString(String str) {

        char[] chArr = str.toCharArray();
        int right = str.length() - 1;
        int left = 0;

        while(left < right) {
            if(!Character.isAlphabetic(chArr[left])) {
                left += 1;
            } 
            else if(!Character.isAlphabetic(chArr[right])) {
                right -= 1;
            }
            else {
                char temp = chArr[left];
                chArr[left] = chArr[right];
                chArr[right] = temp;
                left += 1;
                right -= 1;
            }
        }

        String result = new String(chArr);
        return result;

    }

}
















