import java.util.*;

public class MaxLenZeroSumSubArray {

    public static ArrayList<Integer> findMaxLength(int arr[]) {

        ArrayList<Integer> result_al = new ArrayList<Integer>();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        int sum = 0; 
        int max_length = 0;
        int start_pos = 0, end_pos = 0;

        for(int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // Check for the case of element zero and max_length zero
            if(arr[i] == 0 && max_length == 0) {
                max_length = 1;
                start_pos = i;
                end_pos = i;
            }

            // Check if the sum is zero
            if(sum == 0) {
                max_length = i + 1;
                start_pos = 0;
                end_pos = i;
            }

            Integer prev_pos = hm.get(sum);

            // If the sum had not been previously visited, then add it to the hash map
            if(prev_pos == null) {
                hm.put(sum, i);
            } 
            // Else max_length is the max between the previous max_length and the difference 
            // between the first occurance of that sum and the last occurance of that sum.
            else {

                if(max_length != Math.max(max_length, i - prev_pos)) {
                    start_pos = prev_pos + 1;
                    end_pos = i;
                }

                max_length = Math.max(max_length, i - prev_pos);
            }

        }

        System.out.println("The length of elements for zero sum: " + max_length);

        for(int j = start_pos; j <= end_pos; j++) {
            result_al.add(arr[j]);
        }
        
        return result_al;

    }

    public static void printResult(ArrayList<Integer> result_al) {

        System.out.println("The elements responsible for zero sum: ");
        for(int i : result_al) {
            System.out.print(" " +  i);
        }

    }

    public static void main(String args[]) {

        int arr1[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int arr2[] = {15, -2, 2, -8, 1, 5, 10, 23};

        ArrayList<Integer> result_al = new ArrayList<Integer>();

        result_al = findMaxLength(arr1);
        printResult(result_al);

        // Next Line
        System.out.println();

        result_al = findMaxLength(arr2);
        printResult(result_al);

    }

}










