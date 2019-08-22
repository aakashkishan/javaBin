import java.util.*;

public class SumSmallTriplets {

    public static List<List<Integer>> getTriplets(int[] arr, int sum) {

        List<List<Integer>> result_list = new ArrayList<>();
        if(arr == null || arr.length == 0) {
            return result_list;
        }

        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 2; i++) {
            int curr = i;
            int left = i + 1;
            int right = arr.length - 1;
            while(left < right) {
                List<Integer> list = new ArrayList<>();
                if(arr[curr] + arr[left] + arr[right] < sum) {
                    list.add(arr[curr]);
                    list.add(arr[left]);
                    list.add(arr[right]);
                    result_list.add(list);
                    right -= 1;
                }
                else if(arr[curr] + arr[left] + arr[right] > sum) {
                    right -= 1;
                }
                else {
                    right -= 1;
                }
                if(left >= right) {
                    left += 1;
                    right = arr.length - 1;
                }
            }
        }

        return result_list;

    }

    public static void main(String args[]) {

        int[] arr = new int[] {5, 1, 3, 4, 7};
        int sum = 12;
        List<List<Integer>> result_list = getTriplets(arr, sum);
        System.out.println("The Sum Smaller Triplets: ");
        for(List<Integer> list: result_list) {
            for(int i: list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}










