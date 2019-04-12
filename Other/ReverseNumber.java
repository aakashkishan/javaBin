import java.util.*;

public class ReverseNumber {

    public static int getReverse(int number) {
        int reverse = 0;
        while(number != 0) {
            int temp = reverse * 10 + number % 10;
            number = number / 10;

            // Check if the quotient of the temp, is equal to the reverse value
            if( temp / 10 != reverse) {
                return 0;
            }
            // Update reverse to the value of temp
            reverse = temp;
        }
        return reverse;
    }

    public static void main(String args[]) {

        int number = 243;
        int reverse_number = 0;

        reverse_number = getReverse(number);
        System.out.println("The Reverse Number: " + reverse_number);

    }

}

















