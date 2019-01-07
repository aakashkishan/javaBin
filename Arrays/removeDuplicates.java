import java.lang.*;


public class removeDuplicates {

    public static void main(String args[]) {

        String str = "mississippi";
        System.out.println("Original String: " + str);
        System.out.println("Duplicate-Removed String: " + eraseDuplicate(str.toLowerCase()));

    }

    public static String eraseDuplicate(String str) {

        int[] intArr = new int[129];
        int length = str.length();
        char[] chArr = new char[length];
        chArr = str.toCharArray();
        String result = "";

        for(int i = 1; i <= 128; i++) {
            intArr[i] = 0;
        }

        int i = 0;
        while(i < length) {
            if(intArr[(int) chArr[i]] < 1) {
                intArr[(int) chArr[i]] += 1;
                result += Character.toString(chArr[i]);
            }
            i += 1;
        }

        return result;

    }

}


























