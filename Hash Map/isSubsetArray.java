import java.util.HashMap;

public class isSubsetArray {


    public static int isSubset(int[] arr1, int[] arr2) {

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr1.length; i++) {
            hm.put(arr1[i], 1);
        }

        for(int j = 0; j < arr2.length; j++) {
            if(hm.get(arr2[j]) != null) {
                continue;
            } else {
                return 0;
            }
        }

        return 1;

    }

    public static void main(String args[]) {

        int arr1[] = {11, 1, 13, 21, 3, 7};
        int arr2[] = {11, 3, 7, 1};
        int flag = 0;

        if(arr1.length > arr2.length) {
            flag = isSubset(arr1, arr2);
        } else {
            flag = isSubset(arr2, arr1);
        }


        if(flag == 1) {
            System.out.println("Is a subset");
        } else {
            System.out.println("Is not a subset");
        }

    }

}











