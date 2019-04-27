import java.util.*;

public class ArrayRotation {

    public static int[] rotateLeft(int[] arr, int rotate_left_num) {

        if(rotate_left_num == arr.length) {
            return arr;
        }

        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            result[i] = arr[(i + rotate_left_num) % arr.length];
        }

        return result;

    }

    public static int[] rotateRight(int[] arr, int rotate_right_num) {

        if(rotate_right_num == arr.length) {
            return arr;
        }

        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            result[i] = arr[(i - rotate_right_num + arr.length) % arr.length];
        }

        return result;

    }

    public static void main(String args[]) {

        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        int rotate_left_num = 3;
        int rotate_right_num = 3;

        System.out.print("Original Array: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] result_arr = new int[arr.length];
        result_arr = rotateLeft(arr, rotate_left_num);
        System.out.print("Rotate left " + rotate_left_num + " times: ");
        for(int i : result_arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        result_arr = rotateRight(arr, rotate_right_num);
        System.out.print("Rotate Right " + rotate_right_num + " times: ");
        for(int i : result_arr) {
            System.out.print(i + " ");
        }

    }

}

















