import java.util.*;

public class SearchForRange {

    public static int[] searchRange(int[] numbers, int target) {

        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        if(numbers == null || numbers.length == 0) {
            return result;
        }

        // First Binary Search to find the First Occurence of target
        int start = 0;
        int end = numbers.length - 1;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(numbers[mid] == target) {
                end = mid;
            } else if(numbers[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }

        if(numbers[end] == target) {
            result[0] = end;
        }
        if(numbers[start] == target) {
            result[0] = start;
        }

        // Second Binary Search to find the Last Occurence of target
        start = 0;
        end = numbers.length - 1;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(numbers[mid] == target) {
                start = mid;
            } else if(numbers[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if(numbers[start] == target) {
            result[1] = start;
        }
        if(numbers[end] == target) {
            result[1] = end;
        }

        return result;

    }

    public static void main(String args[]) {

        int[] numbers = new int[] {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result_arr = searchRange(numbers, target);
        for(int i = 0; i < result_arr.length; i++) {
            System.out.println(result_arr[i]);
        }
        
    }

}


























