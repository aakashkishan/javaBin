/* Objective - Sum of differences among all pairs
   EXPLANATION - Given an array of integers, print the sum of bit differences in all non-unique pairs of elements in the array
   EXAMPLE - Array : [1, 2]
             Pairs : (1, 1), (1, 2), (2, 1), (2, 2)
             Computation : 0 + 2 + 2 + 0
             Output : 4 */

import java.lang.*;
import java.io.*;

public class sumBitDifferencePair {

    public static void main(String args[]) {

        int arr[] = {1, 3, 5};

        System.out.println("Sum of Bit Difference in Array Pairs : " + computeBitDifference(arr));

    }

    public static int computeBitDifference(int arr[]) {

        int result = 0;
        int resXOR = 0;

        for(int i = 0; i < arr.length; i++) {

            // Set a base for the first element of the pair
            int base = arr[i];
            for(int j = 0; j < arr.length; j++) {

                // Set a runner for the second element of the pair
                int runner = arr[j];

                // Compute XOR of the elements in the pair
                resXOR = base ^ runner;

                // Compute the number of set digits in the resultant XOR
                while(resXOR != 0) {

                    // If bit is set, then add one to the result
                    if((int) (resXOR & 1) == 1) {
                        result += 1;
                        // Print the pair that have a bit difference
                        System.out.print(arr[i] + " " + arr[j] + "\n");
                    }

                    // Right shift the resultant XOR to find the number of set bits
                    resXOR >>= 1;
                }


            }
        }

        return result;

    }

}
























