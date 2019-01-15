/* Objective - Return the subArray with the maximum XOR value given an array of Intergers */

import java.lang.*;
import java.io.*;

public class maxSubarrayXOR {
    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4};
        System.out.println("The subArray max XOR is: " + getMaxXOR(arr));

    }

    public static int getMaxXOR(int arr[]) {

        int result = Integer.MIN_VALUE;

        // Pick various iteration initiations
        for(int i = 0; i < arr.length; i++) {
            int currXOR = 0;

            // Since we are looking for a subArray, we only check sequential locations in the array
            for(int j = i; j < arr.length; j++) {
                currXOR = currXOR ^ arr[j];
                result = Math.max(currXOR, result);
            }
        }

        return result;

    }
}
















