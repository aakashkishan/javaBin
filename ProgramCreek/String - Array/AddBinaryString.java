import java.util.*;

public class AddBinaryString {

    public static String addBinary(String binary1, String binary2) {

        // Base Conditions
        if(binary1 == null || binary1.length() == 0) {
            return binary2;
        }
        if(binary2 == null || binary2.length() == 0) {
            return binary1;
        }

        int length1 = binary1.length() - 1;
        int length2 = binary2.length() - 1;
        int flag = 0;
        StringBuilder sb = new StringBuilder();
        while(length1 >= 0 || length2 >= 0) {
            int value1 = 0;
            int value2 = 0;
            if(length1 >= 0) {
                value1 = binary1.charAt(length1) == '0' ? 0 : 1;
                length1 -= 1;
            }
            if(length2 >= 0) {
                value2 = binary2.charAt(length2) == '0' ? 0 : 1;
                length2 -= 1;
            }

            int sum = value1 + value2 + flag;
            // Set flag in case of carry-over
            if(sum >= 2) {
                sb.append(String.valueOf(sum - 2));
                flag = 1;
            }
            else {
                flag = 0;
                sb.append(String.valueOf(sum));
            }
        }

        if(flag == 1) {
            sb.append("1");
        }
        // Reverse the String before it is returned
        return sb.reverse().toString();

    }

    public static void main(String args[]) {

        String binary1 = "1001";
        String binary2 = "1010";
        String result_binary = addBinary(binary1, binary2);
        System.out.println("The Resultant Binary: " + result_binary);

    }

}



























