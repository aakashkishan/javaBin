import java.util.*;

public class CountAndSay {

    public static String generateCountAndSay(int n) {

        // Base Condition
        if(n <= 0) {
            return null;
        }

        String result_str = "1";
        int ctr = 0;
        // int start = 0;
        while(ctr < n) {
            StringBuilder sb = new StringBuilder();
            int start = 0;
            for(int i = 1; i < result_str.length(); i++) {
                // If characters are same
                if(result_str.charAt(i) != result_str.charAt(start)) {
                    int count = i - start;
                    sb.append(count);
                    sb.append(result_str.charAt(start));
                    start = i;
                }
                i += 1;
            }

            int count = result_str.length() - start;
            sb.append(count);
            sb.append(result_str.charAt(start));
            result_str = sb.toString();
            ctr += 1;
        }

        return result_str;

    }

    public static void main(String args[]) {

        int n = 5;
        String result_sequence = generateCountAndSay(n);
        System.out.println("The Sequence of Count and Say: " + result_sequence);

    }

}































