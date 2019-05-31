// Note: The Citations Integer Array is already sorted
import java.util.*;

public class HIndexII {

    public static int hIndex(int[] citations) {
        
        int result = 0;
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
        int[] citations = new int[] {0, 1, 3, 5, 5, 6};
        int h_index = hIndex(citations);
        System.out.println("The H-Index: " + h_index);
    }

}



























