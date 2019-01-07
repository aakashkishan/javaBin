import java.lang.*;

public class stringReversal {

    public static void main(String args[]) {

        String str = "Morning Newspaper";
        int len = str.length();
        char[] chArr = new char[str.length()];
        chArr = str.toCharArray();

        System.out.println("Original String: " + str);
        System.out.println("Reverse String: " + computeReverse(chArr, len - 1));

    }

    // Recursive function to find the reverse of a String
    public static String computeReverse(char[] chArr, int length) {
        String result = "";
        int i = length;
        if(length == 0) {
            return Character.toString(chArr[i]);
        }
        result = Character.toString(chArr[i]).concat(computeReverse(chArr, length - 1));
        return result;
    }

}















