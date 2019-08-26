import java.util.*;

public class SelfArrayProduct {

    public static int[] getSelfProduct(int[] arr) {

        if(arr == null || arr.length == 0) {
            return null;
        }

        int[] output = new int[arr.length];
        output[0] = 1;
        for(int i = 0; i < arr.length; i++) {
            output[0] *= arr[i];
        }

        for(int i = 1; i < arr.length; i++) {
            output[i] = output[0];
        }

        for(int i = 0; i < arr.length; i++) {
            output[i] /= arr[i];
        }

        return output;
 
    }

    public static int[] altGetSelfProduct(int[] arr) {

        if(arr == null || arr.length == 0) {
            return null;
        }

        int[] t1 = new int[arr.length];
        int[] t2 = new int[arr.length];
        int[] result = new int[arr.length];
        t1[0] = 1;
        t2[arr.length - 1] = 1;

        for(int i = 0; i < arr.length - 1; i++) {
            t1[i + 1] = arr[i] * t1[i];
        }

        for(int j = arr.length - 1; j > 0; j--) {
            t2[j - 1] = arr[j] * t2[j];
        }

        for(int k = 0; k < arr.length; k++) {
            result[k] = t1[k] * t2[k];
        }

        return result;

    }

    public static void main(String args[]) {

        int[] arr = new int[] {1, 2, 3, 4};
        int[] prod_arr = getSelfProduct(arr);
        System.out.println("The Self Product Array: ");
        for(int i: prod_arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        prod_arr = altGetSelfProduct(arr);
        System.out.println("The Self Product Array(Alternate Method): ");
        for(int i: prod_arr) {
            System.out.print(i + " ");
        }


    }

}



















