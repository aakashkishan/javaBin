import java.util.*;

public class MergeSortedArray {

    public static int[] mergeArrays(int[] arr1, int len1, int[] arr2, int len2) {

        int[] result = new int[len1+ len2];
        if(arr1 == null || len1 == 0 || arr2 == null || len2 == 0) {
            return result;
        }

        int i = len1 - 1;
        int j = len2 - 1;
        int k = len1 + len2 - 1;

        // Until the end of the merged arrau
        while(k >= 0) {
            if(j < 0 || (i >= 0 && arr1[i] > arr2[j])) {
                result[k--] = arr1[i--];
            }
            else {
                result[k--] = arr2[j--];
            }
        }

        return result;

    }

    public static void main(String args[]) {

        int[] arr1 = new int[] {2, 5, 8, 9, 12};
        int[] arr2 = new int[] {1, 3, 4, 6, 8, 9};
        int[] result_arr = new int[arr1.length + arr2.length];
        result_arr = mergeArrays(arr1, arr1.length, arr2, arr2.length);
        for(int i: result_arr) {
            System.out.print(i + " ");
        }

    }

}


























