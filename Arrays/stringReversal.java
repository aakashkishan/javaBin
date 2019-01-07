import java.lang.*;

public class stringReversal {

    public static void main(String args[]) {

        String str = "Morning Newspaper";
        int len = str.length();
        char[] chArr = new char[str.length()];
        chArr = str.toCharArray();

        System.out.println("Original String: " + str);
        System.out.println("Recursive Reverse String: " + recursiveReverse(chArr, len - 1));
        System.out.println("Normal Reverse String: " + computeReverse(chArr, len - 1));

    }

    // Recursive function to find the reverse of a String
    public static String recursiveReverse(char[] chArr, int length) {
        String result = "";
        int i = length;
        if(length == 0) {
            return Character.toString(chArr[i]);
        }
        result = Character.toString(chArr[i]).concat(recursiveReverse(chArr, length - 1));
        return result;
    }

    // Compute function to find the reverse of a String
    public static String computeReverse(char[] chArr, int length) {

        String result = "";
        for(int i = length; i >=0; i--) {
            result += Character.toString(chArr[i]);
        }
        return result;
    }

}















