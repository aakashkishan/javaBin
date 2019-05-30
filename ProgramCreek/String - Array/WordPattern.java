import java.util.*;

public class WordPattern {

    public static boolean wordPattern(String pattern, String str) {
        
        String[] strArr = str.split(" ");
        
        if(strArr.length != pattern.length()) {
            return false;
        }
        
        HashMap<Character, String> hm = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            // If String str does not comply to the repetition of the pattern
            if(hm.containsKey(ch)) {
                String curr_value = hm.get(ch);
                if(!curr_value.equals(strArr[i])) {
                    return false;
                }
            }
            // If String str has unwarranted repetition despite the pattern
            else if(hm.containsValue(strArr[i])) {
                return false;
            }
            else {
                hm.put(ch, strArr[i]);
            }
        }
        
        return true;
            
    }

    public static void main(String args[]) {

        String pattern = "abba";
        String str = "dog cat cat dog";
        boolean isMatch = wordPattern(pattern, str);
        if(isMatch == true) {
            System.out.println("The String is a Match for the Pattern!");
        }
        else {
            System.out.println("The String is not a Match for the Pattern :(");
        }

    }

}





























