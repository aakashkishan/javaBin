import java.lang.*;

public class stringToInteger {

    public static void main(String args[]) {

        String str = "11111";
        System.out.println("Conversion Result: " + convertToInteger(str));

    }

    public static int convertToInteger(String str) {

        int length = str.length();
        int offset = 48;
        int result = 0;

        char[] chArr = new char[length];
        chArr = str.toCharArray();

        for(char ch : chArr) {
            length -= 1;
            // System.out.println((int) chArr[i]);
            result += ((int) ch - offset) * Math.pow(10, length);
        }

        return result;
    }

}











































