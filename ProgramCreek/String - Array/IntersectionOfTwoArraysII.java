import java.util.*;

public class IntersectionOfTwoArraysII {

    public static int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i: nums1) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        
        for(int i: nums2) {
            if(hm.containsKey(i)) {
                list.add(i);
                if(hm.get(i) > 1) {
                    hm.put(i, hm.get(i) - 1);
                }
                else {
                    hm.remove(i);
                }
            }
        }
        
        int[] intersection_nums = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            intersection_nums[i] = list.get(i);
        }
        
        return intersection_nums;
        
    }

    public static void main(String args[]) {

        int[] nums1 = new int[] {9, 1, 2, 9, 2, 8, 6, 9};
        int[] nums2 = new int[] {1, 2, 4, 9, 9, 2};
        int[] intersection_nums = intersect(nums1, nums2);
        System.out.println("The Intersection of Two Arrays with Duplicates: ");
        for(int i: intersection_nums) {
            System.out.print(i + " ");
        }

    }

}