// ASCII for digits: 48 to 57

import java.lang.*;

public class onlyDigits {

    public static void main(String args[]) {

        String str1 = "Password1234";
        String str2 = "96926979480";

        System.out.println("Only Digits check: ");
        System.out.println("String 1: " + checkDigit(str1));
        System.out.println("String 2: " + checkDigit(str2));

    }

    // Check of the characters of the String are only digits
    public static String checkDigit(String str) {

        int length = str.length();
        char[] chArr = new char[length];
        chArr = str.toCharArray();

        for(char ch : chArr) {
            if((int) ch > 57 || (int) ch < 48) {
                return "Gosh! Not a valid Digit String";
            }
        }
        return "Bingo! A valid Digit String";

    }

}

























