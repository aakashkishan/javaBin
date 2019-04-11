import java.util.*;

public class RemoveDuplicates {

    public static int removeDup(int[] numbers) {

        if(numbers == null || numbers.length == 0) {
            return 0;
        }

        int i = 0;
        for(int j = 0; j < numbers.length; j++) {
            // Increment j until both numbers[i] and numbers[j] are different
            if(numbers[i] != numbers[j]) {
                // If the values of indexes i and j are different, 
                // then increment i once and set it with the value of index j
                i++;
                numbers[i] = numbers[j];
            }
        }

        // Return the length until which there are no duplicates
        return i+1;

    }

    public static void main(String args[]) {

        int[] numbers = new int[] {0, 0, 1, 1, 1, 2, 3, 3, 4, 5, 6, 6};
        int length = 0;
        length = removeDup(numbers);

        for(int i = 0; i < length; i++) {
            System.out.print(" " + numbers[i]);
        }

    }

}





















