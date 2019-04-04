import java.util.*;

public class ThreeSum {

    public static void helperTwoSum(int[] arr, List<List<Integer>> results, int target, int left, int right) {

        while(left < right) {

            if(arr[left] + arr[right] == target) {

                List<Integer> triplet = new ArrayList<Integer>();

                // Add the arr[left], arr[right] and target to the triplet
                triplet.add(-target);
                triplet.add(arr[left]);
                triplet.add(arr[right]);

                // Add the triplet to the results list
                results.add(triplet);

                // Increment the left and right to check for other triplets
                left++;
                right--;

                while(left < right && arr[left] == arr[left - 1]) {
                    left++;
                }
                while(left < right && arr[right] == arr[right + 1]) {
                    right--;
                }

            }

            else if(arr[left] + arr[right] > target) {
                right--;
            }

            else if(arr[left] + arr[right] < target) {
                left++;
            }

        }

    }

    public static List<List<Integer>> findThreeSums(int[] arr) {

        List<List<Integer>> results = new ArrayList<>();

        if(arr == null || arr.length == 0) {
            return results;
        }

        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 2; i++) {
            if(i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int target = -arr[i];
            int left = i + 1;
            int right = arr.length - 1;

            helperTwoSum(arr, results, target, left, right);

        }

        return results;

    }

    public static void main(String args[]) {

        int[] arr = new int[] {-1, 0, 1, 2, -1, 4, -5};
        System.out.println(findThreeSums(arr));

    }

}




























