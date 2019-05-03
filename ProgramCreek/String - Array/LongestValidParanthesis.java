import java.util.*;

public class LongestValidParanthesis {

    public static int findLongestValidParanthesis(String str) {

        Stack<int[]> stack = new Stack<int[]>();
        int result = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // In case of close paranthesis
            if(ch == ')') {
                if(!stack.isEmpty() && stack.peek()[0] == 0) {
                    stack.pop();
                    result = Math.max(result, i - (stack.isEmpty()? -1: stack.peek()[1]));
                }
                else {
                    stack.push(new int[] {1, i});
                }
            }
            // In case of open paranthesis
            else {
                stack.push(new int[] {0, i});
            }
        }

        return result;

    }

    public static void main(String args[]) {

        String str = "((())(";
        int length = 0;
        length = findLongestValidParanthesis(str);
        // Print the Longest Valid Paranthesis
        System.out.print("The Longest Valid Paranthesis: " + length);
        

    }

}































