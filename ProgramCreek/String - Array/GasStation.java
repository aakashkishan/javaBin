import java.util.*;

public class GasStation {

    public static int completeTrack(int[] gas, int[] cost) {

        int remaining_sum = 0; // Track current remaining
        int total = 0; // Track total remaining
        int start = 0;

        for(int i = 0; i < gas.length; i++) {
            int remaining = gas[i] - cost[i];

            // If sum remaining of (i-1) >= 0, continue
            if(remaining_sum >= 0) {
                remaining_sum += remaining;
            }
            // Otherwise, reset the start index to be current
            else {
                remaining_sum = remaining;
                start = i;
            }
            total += remaining;
        }

        if(total >= 0) {
            return start;
        }
        else {
            return -1;
        }

    }

    public static void main(String args[]) {

        int[] gas = new int[] {1, 2, 3, 4, 5};
        int[] cost = new int[] {1, 3, 2, 4, 5};
        int track_start_index = completeTrack(gas, cost);
        System.out.println("The Track Start Index: " + track_start_index);

    }

}



























