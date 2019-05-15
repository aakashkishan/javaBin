import java.util.*;

public class SearchInsertionPosition {

    // We can use Binary Search for a problem such as this
    public static int findInsertPosition(int[] nums, int target_num) {

        if(target_num > nums[nums.length - 1]) {
            return nums.length;
        }

        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(target_num > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;

    }

    public static void main(String args[]) {

        int[] nums = new int[] {1, 3, 5, 6};
        int target_num = 2;
        int insert_pos = findInsertPosition(nums, target_num);
        System.out.println("The Insertion Position: " + insert_pos);

    }

}
















































