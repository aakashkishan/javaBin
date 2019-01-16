/* Objective - Count the total number of bits set in all numbers from 1 to n 
   Example - Input : 3 
             Output : 4 */


import java.lang.*;
import java.io.*;

public class totalSetBits {

    public static void main(String args[]) {

        int input = 8;
        System.out.println("The total number of set bits are : " + computeSetBits(input));

    }

    public static int computeSetBits(int input) {

        int counter = 0;

        // Loop through all the numer until range limit
        for(int i = 1; i <= input; i++) {
            int step = i;
            // Log the number of set bits in each-number(step)
            while(step != 0) {
                if((step & 1) == 1) {
                    counter += 1;
                }
                step = step >> 1;
            }
        }

        return counter;

    }

}
















