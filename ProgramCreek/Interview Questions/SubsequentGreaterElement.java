import java.util.*;

public class SubsequentGreaterElement {

    public static int[] getGreaterElements(int[] arr) {

        int[] result = new int[arr.length];
        if(arr == null || arr.length == 0) {
            return result;
        }

        result[arr.length - 1] = -1;
        int max = Integer.MIN_VALUE;
        for(int i = arr.length - 1; i > 0; i--) {
            if(arr[i] > max) {
                max = arr[i];
            }
            result[i - 1] = max;
        }

        return result;

    }

    public static void main(String args[]) {

        int[] arr = new int[] {4, 2, 6, 8, 1, 5};
        int[] result_arr = getGreaterElements(arr);
        System.out.println("The Greater Elements: ");
        for(int i: result_arr) {
            System.out.print(i + " ");
        }

    }

}



