import java.util.*;

public class HIndex {

    public static int hIndex(int[] citations) {

        int result = 0;
        // Base Condition
        if(citations.length == 0 || citations == null) {
            return result;
        }
        
        Arrays.sort(citations);
        for(int i = citations.length - 1; i >= 0; i--) {
            int count = citations.length - i;
            if(citations[i] >= count) {
                result = count;
                continue;
            }
            else {
                break;
            }
        }
        return result;
        
    }

    public static void main(String args[]) {

        int[] citations = new int[] {1, 5, 6, 3, 5, 0};
        int h_index = hIndex(citations);
        System.out.println("The H-Index: " + h_index);

    }

}





























