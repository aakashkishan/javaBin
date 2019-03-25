import java.util.*;

public class isSubsetUsingHashSet {

    public static boolean isSubset(int[] arr1, int[] arr2) {

        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < arr1.length; i++) {
            if(!hs.contains(arr1[i])) {
                hs.add(arr1[i]);
            }
        }

        for(int j = 0; j < arr2.length; j++) {
            if(!hs.contains(arr2[j])) {
                return false;
            }
        }
 
        return true;

    }

    public static void main(String args[]) {
        int arr1[] = {11, 1, 13, 21, 3, 7};
        int arr2[] = {11, 3, 7, 1};

        if(arr1.length > arr2.length) {
            if(isSubset(arr1, arr2)) {
                System.out.println("It is a subset");
            } else {
                System.out.println("It is not a subset");
            }   
        } else {
            if(isSubset(arr2, arr1)) {
                System.out.println("It is a subset");
            } else {
                System.out.println("It is not a subset");
            }   
        }
    }

}