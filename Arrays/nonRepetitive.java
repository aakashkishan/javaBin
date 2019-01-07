import java.lang.*;

public class nonRepetitive {

    public static void main(String args[]) {

        String str = "Aakash";

        int[] intArr = new int[129];
        char[] chArr = new char[str.length()];

        // Initialize to zero
        for(int i = 1; i <= 128; i++) {
            intArr[i] = 0;
        }

        // Log the repeat in characters
        chArr = str.toLowerCase().toCharArray();
        for(char ch : chArr) {
            intArr[(int) ch] += 1;
        }

        // Check for repetitiveness
        for(char ch : chArr) {
            if(intArr[(int) ch] == 1) {
                System.out.println("The first non-repetitive character: " + ch);
                break;
            }
        }


    }

}















