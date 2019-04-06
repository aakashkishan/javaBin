import java.util.*;

public class LargestRectangleInHistogram {

    public static int findLargestRectangle(int[] heights) {

        int max_area = 0;
        if(heights == null || heights.length == 0) {
            return max_area;
        }

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(-1);

        for(int i = 0; i < heights.length; i++) {

            int currentBarHeight = heights[i];

            while(stack.peek() != -1 && currentBarHeight <= heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = i - stack.peek() - 1;

                int area = height * width;
                max_area = Math.max(area, max_area);
            }

            stack.push(i);

        }

        while(stack.peek() != -1) {
            int height = heights[stack.pop()];
            int width = heights.length - stack.peek() - 1;

            int area = height * width;
            max_area = Math.max(area, max_area);
        }

        return max_area;

    }

    public static void main(String args[]) {

        int[] heights = new int[] {2, 1, 5, 6, 2, 3};
        int max_area = 0;

        max_area = findLargestRectangle(heights);
        System.out.println("The Area of the Largest Rectangle: " + max_area);

    }

}






















