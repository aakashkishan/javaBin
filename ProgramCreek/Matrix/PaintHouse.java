// Note: 0 - Red, 1 - Blue, 2 - Green

import java.util.*;

public class PaintHouse {

    public static int getMinimumCost(int[][] costs) {

        if(costs == null || costs.length == 0 || costs[0].length == 0) {
            return 0;
        }
        
        int min_cost = Integer.MIN_VALUE;
        int m = costs.length;
        for(int i = 1; i < m; i++) {
            costs[i][0] += Math.min(costs[i-1][1], costs[i-1][2]);
            costs[i][1] += Math.min(costs[i-1][0], costs[i-1][2]);
            costs[i][2] += Math.min(costs[i-1][0], costs[i-1][1]);
        }

        min_cost = Math.min(Math.min(costs[m-1][0], costs[m-1][1]), costs[m-1][2]);

        return min_cost;

    }

    public static void main(String args[]) {

        int[][] costs = new int[][] {{14, 2, 11}, {11, 14, 5}, {14, 3, 10}};
        int min_cost = getMinimumCost(costs);
        System.out.println("The Minimum Cost to Paint all Houses: " + min_cost);

    }

}



















