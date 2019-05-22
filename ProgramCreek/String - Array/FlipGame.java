import java.util.*;

public class FlipGame {

    public static List<String> getFlips(String str) {

        List<String> result = new ArrayList<String>();
        if(str == null || str.length() == 0) {
            return result;
        }

        char[] chArr = str.toCharArray();
        for(int i = 0; i < str.length() - 1; i++) {
            if(chArr[i] == '+' && chArr[i + 1] == '+') {
                chArr[i] = '-';
                chArr[i + 1] = '-';
                result.add(new String(chArr));
                chArr[i] = '+';
                chArr[i + 1] = '+';
            }
        }

        return result;

    }

    public static void main(String args[]) {

        String str = "++++";
        List<String> result_strs = getFlips(str);
        System.out.println("The Resultant Flips: ");
        for(String s: result_strs) {
            System.out.print(s + " ");
        }

    }

}
























