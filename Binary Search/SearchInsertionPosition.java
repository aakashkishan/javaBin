import java.util.*;

public class SearchInsertionPosition {

    public static int findSearchPosition(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length - 1;

        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(numbers[mid] == target) {
                return mid;
            } else if(numbers[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if(numbers[end] < target) {
            return end + 1;
        } else if(numbers[start] >= target) {
            return start;
        } else {
            return end;
        }

    }

    public static void main(String args[]) {

        int[] numbers = new int[] {1, 3, 5, 6};
        int target = 2;
        int resultant_position = findSearchPosition(numbers, target);
        System.out.println("The Search Position: " + resultant_position);

    }

}



























