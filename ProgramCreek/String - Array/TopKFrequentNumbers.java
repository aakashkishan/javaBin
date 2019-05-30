import java.util.*;

public class TopKFrequentNumbers {

    public static List<Integer> altTopKFrequent(int[] nums, int k) {
        
        List<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i: nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        
        // Create a Min Heap
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(Comparator.comparing(e -> e.getValue()));
        
        // Maintain the heap
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()) {
            queue.offer(entry);
            if(queue.size() > k) {
                queue.poll();
            }
        }
        
        // Get all elements of the heap
        while(queue.size() > 0) {
            result.add(queue.poll().getKey());            
        }
        // Reverse the array list to get the top frequent elements in descending order
        Collections.reverse(result);
        
        return result;
        
    }

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

        System.out.println();
        result_list = altTopKFrequent(nums, k);
        System.out.println("Alternate Method: Top K Frequent Numbers: ");
        for(int i: result_list) {
            System.out.print(i + " ");
        }

    }

}



























