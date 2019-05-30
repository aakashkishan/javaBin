import java.util.*;

public class TopKFrequentNumbers {

    public static List<Integer> topKFrequent(int[] nums, int k) {
        
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> al = new ArrayList<Integer>();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i: nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
            if(!al.contains(i)) {
                al.add(i);   
            }
        }
        
        for(int i = 0; i < k; i++) {
            int max = hm.get(al.get(0));
            int max_index = 0;
            for(int j = 1; j < al.size(); j++) {
                if(hm.get(al.get(j)) > max) {
                    max = hm.get(al.get(j));
                    max_index = j;
                }
            }
            result.add(al.get(max_index));
            al.remove(max_index);
        }
        
        return result;
        
    }

    public static void main(String args[]) {

        int[] nums = new int[] {1, 1, 2, 3, 2, 1};
        int k = 2;
        List<Integer> result_list = topKFrequent(nums, k);
        System.out.println("The Top K Frequent Numbers: ");
        for(int i: result_list) {
            System.out.print(i+ " ");
        }

    }

}



























