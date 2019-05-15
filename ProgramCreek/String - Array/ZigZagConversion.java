import java.util.*;

public class ZigZagConversion {

    public static String findZigZag(String str, int rows) {

        // Null Check
        if(str.length() == 0 || str == null) {
            return "";
        }

        if(rows == 1) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        int step = 2 * rows - 2;
        for(int i = 0; i < rows; i++) {
            // First and Last Rows
            if(i == 0 || i == rows - 1) {
                for(int j = i; j < str.length() ; j = j + step) {
                    sb.append(str.charAt(j));
                }
            }

            // Intermediate Rows
            else {
                int j = i;
                boolean flag = true;
                int step1 = 2 * (rows - i - 1);
                int step2 = step - step1;
                while(j < str.length()) {
                    sb.append(str.charAt(j));
                    if(flag) {
                        j = j + step1;
                    }
                    else {
                        j = j + step2;
                    }
                    flag = !flag;
                }
            }
        }

        return sb.toString();

    }

    public static void main(String args[]) {

        String str = "PAYPALISHIRING";
        int rows = 5;
        String result_str = findZigZag(str, rows);
        System.out.println("The Zig Zag String: " + result_str);

    }

}


































