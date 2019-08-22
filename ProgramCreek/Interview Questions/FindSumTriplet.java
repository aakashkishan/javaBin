import java.util.*;

public class FindSumTriplet {

    public static boolean getSumTriplet(int[] arr, int[] triplet, int sum) {

        if(arr == null || arr.length == 0) {
            return false;
        }

        int left, right, curr;
        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 2; i++) {
            left = i + 1;
            right = arr.length - 1;
            curr = i;
            while(left < right) {
                if(arr[curr] + arr[left] + arr[right] == sum) {
                    triplet[0] = arr[curr];
                    triplet[1] = arr[left];
                    triplet[2] = arr[right];
                    return true;
                }
                else if(arr[curr] + arr[left] + arr[right] > sum) {
                    right -= 1;
                }
                else {
                    left += 1;
                }
            }
        }

        return false;

    }

    public static void main(String args[]) {

        int[] arr = new int[] {12, 3, 4, 1, 6, 9};
        int[] triplet = new int[3];
        int sum = 24;
        boolean isTriplet = getSumTriplet(arr, triplet, sum);
        if(isTriplet == true) {
            System.out.println("The Triplet: ");
            for(int i: triplet) {
                System.out.print(i + " ");
            }
        }
        else {
            System.out.println("No Triplets were found :(");
        }

    }

}











