import java.util.*;

public class ClosestThreeSum {

    public static ArrayList<Integer> findClosestThreeSum(int[] arr, int target) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        Arrays.sort(arr);
        int closestSum = arr[0] + arr[1] + arr[2];

        for(int i = 0; i < arr.length; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while(left< right) {

                int sum = arr[i] + arr[left] + arr[right];

                if(Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                    result.clear();
                    result.add(arr[i]);
                    result.add(arr[left]);
                    result.add(arr[right]);
                }

                if(sum < target) {
                    left++;
                } else {
                    right--;
                }

            }

        }

        return result;

    }

    public static void main(String args[]) {

        int[] arr = new int[] {-1, 1, 2, -4};
        int target = -2;

        System.out.println(findClosestThreeSum(arr, target));

    }

}



























