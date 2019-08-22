import java.util.*;

public class SlidingWindowMaximum {

    public static int[] getWindowMaximum(int[] arr, int window_size) {

        if(arr == null || arr.length < 3) {
            return null;
        }

        int[] window_maximum = new int[arr.length - 2];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length - 2; i++) {
            max = arr[i];
            for(int j = 1; j < window_size; j++) {
                if(arr[i + j] > max) {
                    max = arr[i + j];
                }
            }
            window_maximum[i] = max;
        }

        return window_maximum;

    }

    public static void main(String args[]) {

        int[] arr = new int[] {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int window_size = 3;
        int[] window_maximum = getWindowMaximum(arr, window_size);
        System.out.println("The Sliding Window Maximum: ");
        for(int i: window_maximum) {
            System.out.print(i + " ");
        }

    }

}











