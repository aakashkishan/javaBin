import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> getThreeSum(int[] nums) {

        if(nums == null || nums.length < 3) {
            return null;
        }

        List<List<Integer>> three_sums = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            int curr = nums[i];
            int required_sum = -curr;
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                if(nums[left] + nums[right] == required_sum) {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(curr);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    three_sums.add(temp);
                    right -= 1;
                }
                else if(nums[left] + nums[right] < required_sum) {
                    left += 1;
                }
                else {
                    right -= 1;
                }
            }
        }
        return three_sums;

    }

    public static void main(String args[]) {

        int[] nums = new int[] {-1, 0, 1, 4, -1, 2};
        List<List<Integer>> three_sums = getThreeSum(nums);
        System.out.println("the Three Sums: ");
        for(List<Integer> list: three_sums) {
            for(int i: list) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }

    }

}

