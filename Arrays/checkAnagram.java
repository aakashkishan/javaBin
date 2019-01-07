import java.lang.*;

public class checkAnagram {

    public static void main(String args[]) {

        String str1 = "Java";
        String str2 = "Ajav";
        int[] intArr1 = new int[129];
        int[] intArr2 = new int[129];

        //Initialize to Zero
        for(int i = 1; i <= 128; i++) {
            intArr1[i] = 0;
            intArr2[i] = 0;
        }

        //Convert the Strings to character arrays
        char[] chArr1 = new char[str1.length()];
        char[] chArr2 = new char[str2.length()];
        chArr1 = str1.toLowerCase().toCharArray();
        chArr2 = str2.toLowerCase().toCharArray();

        //Log the various characters in the strings
        for(char ch : chArr1) {
            intArr1[(int) ch] += 1;
        }

        for(char ch : chArr2) {
            intArr2[(int) ch] += 1;
        }

        //Check if anagram
        int flag = 0;
        for(int i = 1; i <= 128; i++) {
            if(intArr1[i] == intArr2[i]) {
                flag += 1;
            }
        }

        if(flag == 128) {
            System.out.println("Yay! You've found anagrams");
        } else {
            System.out.println("Nah! No anagrams");
        }

    }

}