import java.lang.*;

public class checkAnagram {

    public static void main(String args[]) {

        String str1 = "Java";
        String str2 = "Ajav";
        int[] intArr1 = new int[129];
        int[] intArr2 = new int[129];

        //Initialize to Zero
        for(int i = 1; i <= 128; i++) {
            intArr[i] = 0;
        }

        char[] chArr = new char[str.length()];
        chArr = str.toCharArray();

        for(char ch : chArr) {
            intArr[(int) ch] += 1;
        }

        for(int i = 1; i <= 128; i++) {
            if(intArr[i] > 1) {
                System.out.println((char) i + " : " + intArr[i]);
            }
        }

    }

}