import java.util.*;

public class TrappingRainWater {

    public static int trapWater(int[] terrain_heights) {

        int result = 0;
        // Base Condition
        if(terrain_heights == null || terrain_heights.length == 0) {
            return result;
        }

        int[] left = new int[terrain_heights.length];
        int[] right = new int[terrain_heights.length];
        // Scan Left to Right
        int max = terrain_heights[0];
        left[0] = terrain_heights[0];
        for(int i = 1; i < terrain_heights.length; i++) {
            left[i] = Math.max(max, terrain_heights[i]);
            max = Math.max(max, terrain_heights[i]);
        }

        // Scan Right to Left
        max = terrain_heights[terrain_heights.length - 1];
        right[terrain_heights.length - 1] = terrain_heights[terrain_heights.length - 1];
        for(int i = terrain_heights.length - 2; i >= 0; i--) {
            right[i] = Math.max(max, terrain_heights[i]);
            max = Math.max(max, terrain_heights[i]);
        }

        // Calculate the Amount of Water Trapped
        for(int i = 0; i < terrain_heights.length; i++) {
            result += Math.min(left[i], right[i]) - terrain_heights[i];
        }

        return result;

    }

    public static void main(String args[]) {

        int[] terrain_heights = new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int trapped_water = trapWater(terrain_heights);
        System.out.println("The Amount of rain trapped: " + trapped_water);

    }

}






















