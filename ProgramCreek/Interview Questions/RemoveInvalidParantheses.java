import java.util.*;

class Solution {

    List<String> result = new ArrayList<String>();
    int max = 0;

    public List<String> removeInvalidParantheses(String str) {

        if(str == null) {
            return result;
        }

        dfs(str, "", 0, 0);
        if(result.size() == 0) {
            result.add("");
        }
        return result;

    }

    public void dfs(String left, String right, int count_left, int max_left) {

        if(left.length() == 0) {
            if(count_left == 0 && right.length() != 0) {
                if(max_left > max) {
                    max = max_left;
                }

                if(max_left == max && !result.contains(right)) {
                    result.add(right);
                }
            }
            return;
        }

        if(left.charAt(0) == '(') {
            // Keep the Left Parantheses
            dfs(left.substring(1), right + "(", count_left + 1, max_left + 1);
            // Drop the Left Parantheses
            dfs(left.substring(1), right, count_left, max_left);
        }
        else if(left.charAt(0) == ')') {
            if(count_left > 0) {
                // Keep the Right Parantheses
                dfs(left.substring(1), right + ")", count_left - 1, max_left);
            }
            // Drop the Right Parantheses
            dfs(left.substring(1), right, count_left, max_left);
        }
        else {
            dfs(left.substring(1), right + String.valueOf(left.charAt(0)), count_left, max_left);
        }

    }

}

public class RemoveInvalidParantheses {

    public static void main(String args[]) {

        String str = "()())()";
        List<String> balanced_str = new Solution().removeInvalidParantheses(str);
        System.out.println("The Original String: " + str);
        for(String bstr: balanced_str) {
            System.out.println("The Balanced String: " + bstr);
        }

    }

}

















