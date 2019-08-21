import java.util.*;


public class LongestIncreasingSequence {

    public static int getLIS(int[] arr) {

        int length = arr.length;
        int[] lis_count = new int[length];
        for(int i = 0; i < length; i++) {
            lis_count[i] = 1;
        }

        for(int i = 1; i < length; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[i] > arr[j] && lis_count[i] < lis_count[j] + 1) {
                    lis_count[i] = lis_count[j] + 1;
                }
            }
        }
        
        int max = 0;
        for(int i = 0; i < length; i++) {
            if(lis_count[i] > max) {
                max = lis_count[i];
            }
        }

        return max;

    }

    public static void main(String args[]) {

        int[] arr = new int[] {3, 10, 2, 1, 20};
        int lis_length = getLIS(arr);
        System.out.println("The Longest Increasing Sequence's Length: " + lis_length);

    }

}