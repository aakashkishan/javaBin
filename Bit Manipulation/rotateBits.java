/* Objective - A circular rotation of bits in the number 
   Example - Input : 16 (10000)
             Action : circular left rotate twice
             Output : 64 (1000000) */


import java.lang.*;
import java.io.*;


public class rotateBits {

    static final int INT_BITS = 32;

    public static void main(String args[]) {

        int input = 16;
        System.out.println("Rotate Left Result: " + rotateLeft(input));
        System.out.println("Rotate Right Result: " + rotateRight(input));

    }

    public static int rotateLeft(int input) {

        int shiftRate = 2;
        /* In input << shiftRate, last shiftRate bits are 0. To put first 2 bits of input at last, 
           do bitwise or of input << shiftRate with input >> (INT_BITS - shiftRate) */
        return (input << 2) | (input >> (INT_BITS - shiftRate));

    }

    public static int rotateRight(int input) {

        int shiftRate = 2;
        /* In input >> shiftRate, last shiftRate bits are 0. To put first 2 bits of input at last, 
           do bitwise or of input >> shiftRate with input << (INT_BITS - shiftRate) */
        return (input >> 2) | (input << (INT_BITS - shiftRate));

    }

}
























