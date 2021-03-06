import java.util.*;

public class ReverseInteger {

    // Normal solution
    public static int reverseNumber(int number) {
        int reverse = 0;
        while(number > 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }

        return reverse;
    }

    public static void main(String args[]) {

        int number = 12489;
        System.out.print("Original Number: " + number);
        System.out.println();

        int reverse_number = reverseNumber(number);
        System.out.print("Reverse Number: " + reverse_number);
        System.out.println();

    }

}



































