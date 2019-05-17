import java.util.*;

public class LargestRectangleInHistogram {

    public static int largestRectangleArea(int[] heights) {

        // Base Condition
        if(heights == null || heights.length == 0) {
            return 0;
        }

        Stack<Integer> stack = new Stack<Integer>();
        int max = 0;
        int i = 0;

        while(i < heights.length) {
            // Push index into stack when current height greater than previous height
            if(stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
                stack.push(i);
                i += 1;
            }
            // Calculate the max value when current height is lesser than previous height
            else {
                int top = stack.pop();
                int height = heights[top];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(max, height * width);
            }
        }

        while(!stack.isEmpty()) {
            int top = stack.pop();
            int height = heights[top];
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
            max = Math.max(max, height * width);
        }

        return max;
        
    }

    public static void main(String args[]) {

        int[] heights = new int[] {2, 1, 5, 6, 2, 3};
        int area = largestRectangleArea(heights);
        System.out.println("The Area of the Largest Rectangle: " + area);

    }

}

































