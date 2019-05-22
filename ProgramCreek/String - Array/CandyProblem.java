import java.util.*;

public class CandyProblem {

    public static int findMinCandies(int[] ratings) {

        // Base Condition
        if(ratings == null || ratings.length == 0) {
            return 0;
        }

        int[] candies = new int[ratings.length];
        int[] left = new int[ratings.length];
        int[] right = new int[ratings.length];
        left[0] = 1;
        // Scan from Left
        for(int i = 1; i < ratings.length; i++) {
            if(ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
            else {
                left[i] = 1;
            }
        }

        right[ratings.length - 1] = 1;
        for(int i = ratings.length - 2; i >= 0; i--) {
            if(ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
            else {
                right[i] = 1;
            }
        }

        for(int i = 0; i < ratings.length; i++) {
            candies[i] = Math.max(left[i], right[i]);
        }

        int result = 0;
        for(int i = 0; i < ratings.length; i++) {
            result += candies[i];
        }

        return result;

    }

    public static void main(String args[]) {

        int[] ratings = new int[] {1, 0, 3, 2};
        int candy_result = findMinCandies(ratings);
        System.out.println("The required amount of candies: " + candy_result);

    }

}



















