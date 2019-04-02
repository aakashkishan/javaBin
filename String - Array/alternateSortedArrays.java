/* Objective - Genetrate all possible sorted arrays from alternate elements of 
               two given sorted arrays.
   Example - Input : A = {10, 15, 25}
                     B = {1, 5, 20, 30}

             Output : 10 20
                      10 20 25 30
                      10 30
                      15 20
                      15 20 25 30
                      15 30
                      25 30 */



import java.lang.*;
import java.io.*;

public class alternateSortedArrays {

    public static void main(String args[]) {

        alternateSortedArrays classObject = new alternateSortedArrays();
        int A[] = {10, 15, 25};
        int B[] = {5, 20, 30};

        System.out.println("The resultant alternate sorted arrays are : ");
        classObject.generateAlternateArrays(A, B, B.length, A.length);

    }

    public static void fetchAlternateArrays(int A[], int B[], int C[], int index1, int index2, 
                                            boolean flag, int length) {

        if(flag) {
            if(length != 0) {
                printArray(C, length + 1);
            }

            for(int i = index1; i < B.length; i++) {
                if(length == 0) {
                    C[length] = C[i];
                    fetchAlternateArrays(A, B, C, i + 1, index2, !flag, length);
                }
                else if(A[i] > C[length]) {
                    C[length + 1] = A[i];
                    fetchAlternateArrays(A, B, C, i + 1, index2, !flag, length + 1);
                }
            }
        }
        else {
            for(int j = index2; j < A.length; j++) {
                if(B[j] > C[length]) {
                    C[length + 1] = B[j];
                    fetchAlternateArrays(A, B, C, index1, j + 1, !flag, length + 1);
                }
            }
        }

    }

    public static void printArray(int arr[], int length) {
        for(int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void generateAlternateArrays(int A[], int B[], int length1, int length2) {
        int C[] = new int[length1 + length2];
        fetchAlternateArrays(A, B, C, 0, 0, true, 0);
    }

}
















