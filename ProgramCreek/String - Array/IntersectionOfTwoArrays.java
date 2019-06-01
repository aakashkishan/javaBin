import java.util.*;

public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> hs = new HashSet<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i: nums1) {
            if(!hs.contains(i)) {
                hs.add(i);
            }
        }
        
        for(int i: nums2) {
            if(hs.contains(i)) {
                result.add(i);
                hs.remove(i);
            }
        }
        int[] intersection = new int[result.size()];
        
        for(int i = 0; i < result.size(); i++) {
            intersection[i] = result.get(i);
        }
        
        return intersection;
        
    }

    public static void main(String args[]) {

        int[] nums1 = new int[] {4, 9, 5};
        int[] nums2 = new int[] {9, 4, 9, 8, 4};
        int[] intersection_nums = intersection(nums1, nums2);
        System.out.println("The Intersection of Two Arrays: ");
        for(int i: intersection_nums) {
            System.out.print(i + " ");
        }

    }

}

























