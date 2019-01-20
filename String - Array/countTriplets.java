/* Objective - Count the Triplets with a smaller sum than a particular number
   Example - Input : arr[] = {-2, 1, 0, 3}
             Number : 2
             Output : 2 {(-2, 0, 1) and (-2, 0, 3)} */


import java.lang.*;
import java.io.*;


public class countTriplets {

    public static void main(String args[]) {

        int arr[] = {-2, 1, 0, 3};
        int number = 2;
        System.out.println("The Count of Triplets : " + fetchTriplets(arr, number));

    }

    public static int fetchTriplets(int arr[], int number) {

        int counter = 0;
        int length = arr.length;

        System.out.println("The Triplets are : ");
        for(int i = 0; i < length - 2; i++) {
            for(int j = i + 1; j < length - 1; j++) {
                for(int k = j + 1; k < length; k++) {
                    if(arr[i] + arr[j] + arr[k] < number) {
                        System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
                        counter += 1;
                    }
                }
            }
        }

        return counter;

    }

}











