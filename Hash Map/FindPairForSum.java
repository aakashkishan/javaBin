import java.util.*;

public class FindPairForSum {

    public static ArrayList<Integer> findPairs(int arr[], int sum) {

        ArrayList<Integer> result_al = new ArrayList<Integer>();
        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i = 0; i < arr.length; i++) {
            int difference = sum - arr[i];

            if(difference >= 0 && hs.contains(difference)) {
                result_al.add(arr[i]);
                result_al.add(difference);
            }
            hs.add(arr[i]);
        }

        return result_al;

    }

    public static void main(String args[]) {

        int arr[] = {4, 10, 2, 6, 12, 8};
        int sum = 16;

        ArrayList<Integer> al = new ArrayList<Integer>();
        al = findPairs(arr, sum);

        System.out.println("The Pairs for the sum:");
        for(int i = 0; i < al.size(); i += 2) {
            System.out.print(al.get(i) + ", " + al.get(i + 1));
            System.out.println();
        }
        

    }

}











