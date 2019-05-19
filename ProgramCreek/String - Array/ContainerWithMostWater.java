import java.util.*;

public class ContainerWithMostWater {

    public static int findMostWater(int[] heights) {

        // Base Condition
        if(heights == null || heights.length < 2) {
            return 0;
        }

        int max = 0;
        int left = 0; // Left Pointer
        int right = heights.length - 1; // Right Pointer
        while(left < right) {
            max = Math.max(max, (right - left) * Math.min(heights[left], heights[right]));
            // Move Left pointer if the height of left is lesser than height of right
            if(heights[left] < heights[right]) {
                left += 1;
            }
            // Move Right pointer if the height of right is lesser than height of left
            else {
                right -= 1;
            }
        }

        return max;

    }

    public static void main(String args[]) {

        int[] heights = new int[] {2, 4, 6, 4, 5, 4, 8, 4};
        int most_water = findMostWater(heights);
        System.out.println("The Most Water in the Container: " + most_water);

    }

}




























