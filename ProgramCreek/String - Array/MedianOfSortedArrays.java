import java.util.*;

public class MedianOfSortedArrays {

    public static int getKth(int[] nums1, int i1, int j1, int[] nums2, int i2, int j2, int k) {

        if(j1 < i1) {
            return nums2[i2 + k];
        }
        if(j2 < i2) {
            return nums1[i1 + k];
        }
        if(k == 0) {
            return Math.min(nums1[i1], nums2[i2]);
        }

        int length1 = j1 - i1 + 1;
        int length2 = j2 - i2 + 1;
        int median1 = k * length1 / (length1 + length2);
        int median2 = k - median1 + 1;
        median1 += i1;
        median2 += i2;

        if(nums1[median1] < nums2[median2]) {
            k = k - (median1 - i1 + 1);
            j2 = median2;
            i1 = median1 + 1;
        } else {
            k = k - (median2 - i2 + 1);
            j1 = median1;
            i2 = median2 + 1;
        }

        return getKth(nums1, i1, j1, nums2, i2, j2, k);

    }

    public static double findSortedArraysMedian(int[] nums1, int[] nums2) {

        int total_length = nums1.length + nums2.length;
        if(total_length % 2 == 0) {
            return (getKth(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1, total_length / 2) +
                    getKth(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1, total_length / 2 - 1)) / 2.0;
        } else {
            return (getKth(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1, total_length / 2));
        }

    }

    public static void main(String args[]) {

        int[] nums1 = new int[] {1, 3, 4, 6, 7, 9};
        int[] nums2 = new int[] {2, 3, 4, 5, 7, 8};
        double result_median = 0;
        result_median = findSortedArraysMedian(nums1, nums2);
        System.out.print("The Median of the Sorted arrays: " + result_median);

    }

}


























