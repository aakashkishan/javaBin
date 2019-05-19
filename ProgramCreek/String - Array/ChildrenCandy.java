import java.util.*;

public class ChildrenCandy {

    public static int numberOfCandies(int[] ratings) {

        // Base Condition
        if(ratings == null || ratings.length == 0) {
            return 0;
        }

        int[] candies = new int[ratings.length];
        candies[0] = 1;
        // From Left to Right
        for(int i = 1; i < ratings.length; i++) {
            if(ratings[i] > ratings[i - 1]) {
                // If the ratings is ascending, then
                // Increment the number of candies of the previous rating for the current ratings
                candies[i] = candies[i - 1] + 1;
            }
            else {
                // If ratings is not ascending, then just assign 1
                candies[i] = 1;
            }
        }

        int result = candies[ratings.length - 1];
        // From Right to Left
        for(int i = ratings.length - 2; i >= 0; i--) {
            int current = 1;
            // If ratings are not ascending,
            // then increment the next rating's candies for the current
            if(ratings[i] > ratings[i + 1]) {
                current = candies[i + 1] + 1;
            }

            result += Math.max(current, candies[i]);
            candies[i] = current;
        }

        return result;

    }

    public static void main(String args[]) {

        int[] ratings = new int[] {1, 2, 2};
        int candies = numberOfCandies(ratings);
        System.out.println("The Number of Candies required: " + candies);

    }

}





































