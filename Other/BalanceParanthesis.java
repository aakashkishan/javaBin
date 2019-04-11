import java.util.*;

public class BalanceParanthesis {

    public static boolean isPair(char ch1, char ch2) {
        boolean isPaired = false;
        isPaired = (ch1 == '{' && ch2 == '}') ||
                    (ch1 == '[' && ch2 == ']') ||
                    (ch1 == '(' && ch2 == ')');
        return isPaired;
    }

    public static boolean validateString(String str) {

        Stack<Character> st = new Stack<Character>();
        boolean isValid = false;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '{' || ch == '[' || ch == '(') {
                st.push(ch);
            } else {
                if(!st.isEmpty() && isPair(st.peek(), ch)) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        isValid = st.isEmpty();
        return isValid;

    }

    public static void main(String args[]) {

        String str = new String("{{[(){}]}()}");
        boolean isValid = false;

        isValid = validateString(str);
        if(isValid == true) {
            System.out.println("The String is Balanced!");
        } else {
            System.out.println("The String is not Balanced :(");
        }

    }

}
































