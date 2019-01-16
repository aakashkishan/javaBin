/* Objective - Count the number of bits required to be flipped to convert A to B
   Example - Input : A = 10. B = 20
             Binary Representations : A = 00001010
                                      B = 00010100
             Output : 4 */


import java.lang.*;
import java.io.*;


public class countFlipBits {

    public static void main(String args[]) {

        int A = 10, B = 20;
        System.out.println("Flip Bits Count : " + computeFlipBits(A, B));

    }

    public static int computeFlipBits(int A, int B) {

        int resXOR = A ^ B;
        int count = 0;
        while(resXOR != 0) {
            if((int) (resXOR & 1) == 1) {
                count += 1;
            }
            resXOR >>= 1;
        }
        return count;

    }

}

















