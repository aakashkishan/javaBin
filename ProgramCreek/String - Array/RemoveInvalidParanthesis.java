import java.util.*;

class Solution {

    ArrayList<String> result = new ArrayList<String>();
    int max = 0;
    
    public List<String> removeInvalidParentheses(String s) {
        
        if(s == null || s.length() == 0) {
            return result;
        }    
        
        dfs(s, "", 0, 0);
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
            // Keep the left paranthesis "("
            dfs(left.substring(1), right + "(", count_left + 1, max_left + 1);
            // Lose the left paranthesis "("
            dfs(left.substring(1), right, count_left, max_left);
        }
        else if(left.charAt(0) == ')') {
            if(count_left > 0) {
                dfs(left.substring(1), right + ")", count_left - 1, max_left);
            }
            dfs(left.substring(1), right, count_left, max_left);
        }
        else {
            dfs(left.substring(1), right + String.valueOf(left.charAt(0)), count_left, max_left);
        }
        
    }

}

public class RemoveInvalidParanthesis {

    public static void main(String args[]) {

        String s = "()())()";
        List<String> result = new Solution().removeInvalidParentheses(s);
        System.out.println("Remove Invalid Paranthesis: ");
        for(String str: result) {
            System.out.println(str);
        }

    }

}
























