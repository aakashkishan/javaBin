/* Objective - given a number n, generate the nth magic number
   NOTE : A Magic Number is a power of 5 or sum of unique powers of 5 
   Strategy : The magic number is a perfect power of 5 when n is a power of 2 
   Example : 5, 25, 30, 125, 130, 150, 155, ...  */

import java.lang.*;
import java.io.*;

public class nthMagicNumber {

    public static void main(String args[]) {

        int n = 6;
        System.out.println("Computed Magic Number: " + computeMagicNumber(n));

    }

    public static int computeMagicNumber(int n) {

        int result = 0;
        int exponenet = 1;

        // Iterate through the bits
        while(n != 0) {

            exponenet = exponenet * 5;

            // If last bit of n is set to 1
            if((int) (n & 1) == 1) {
                result += exponenet;
            }

            // Divide the number n by 2
            n >>= 1;

        }

        return result;

    }

}



















