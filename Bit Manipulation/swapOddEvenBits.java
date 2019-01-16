/* Objective - Swap the Odd and Even bits of a number
   Example - Input : 23 (00010111)
             Output : 43 (00101011) */

import java.lang.*;
import java.io.*;

public class swapOddEvenBits {

    public static void main(String args[]) {

        int input = 23;
        System.out.println("Result of Odd-Even bits Swap : " + swapBits(input));

    }

    public static int swapBits(int input) {

        // Obtain the Even Bits and Odd Bits using Bit Masks
        int evenBits = input & 0xAAAAAAAA;
        int oddBits = input & 0x55555555;
        int result = 0;

        // Right Shift the evenBits into location of oddBits
        evenBits >>= 1;

        // Left Shift the oddBits into location of evenBits
        oddBits <<= 1;

        result = evenBits | oddBits;
        return result;

    }

}



























