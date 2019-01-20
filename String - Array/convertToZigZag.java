/* Objective - Convert an array into zig zag order of ascending order.
               i.e. where elements a, b, c, d, e are arranged as a < b > c < d > e
   Example - Input : arr[] = {4, 3, 7, 8, 6, 2, 1}
             Output : arr[] = {3, 7, 4, 8, 2, 6, 1}
   Solution - (a) In Complexity O(n) 
              (b) Sort the complete array and then arrange them in zig zag pattern*/


import java.lang.*;
import java.io.*;

public class convertToZigZag {

    public static void main(String args[]) {

        int arr[] = {4, 3, 7, 8, 6, 2, 1};
        arrayZigZag(arr, arr.length);

        System.out.println("The Zig Zag Array is : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int arr2[] = {4, 3, 7, 8, 6, 2, 1};
        alternativeArrayZigZag(arr, arr.length);

        System.out.println("\nThe Zig Zag Array is (O(n) solution): ");
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }

    public static void arrayZigZag(int arr[], int length) {

        // First Sort the Array 
        for(int i = 0; i < length - 1; i++) {
            for(int j = i + 1; j < length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Swap the elements of array in pairs except the first element 
        for(int i = 1; i < length; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

    }

    public static void alternativeArrayZigZag(int arr[], int length) {

        /* Flag true indicates relation "<" is expected, 
           else ">" is expected.  The first expected relation 
           is "<"  */
        boolean flag = true;

        for(int i = 0; i < arr.length - 1; i++) {

            /* "<" relation expected */
            if(flag) {
                /* If we have a situation like A > B > C, 
                   we get A > B < C by swapping B and C */
                if(arr[i] > arr[i + 1]) {
                    // Swap the Elements
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                } 
            }
            /* ">" relation expected */
            else {
                /* If we have a situation like A < B < C, 
                   we get A < C > B by swapping B and C */
                if(arr[i] < arr[i + 1]) {
                    // Swap the Elements
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

            // Alternate the Flag
            flag = !flag;

        }


    }

}

















