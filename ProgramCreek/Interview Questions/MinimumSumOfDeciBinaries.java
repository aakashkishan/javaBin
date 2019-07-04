import java.util.*;

public class MinimumSumOfDeciBinaries {

    public static void solve(int number) {

        int max = Integer.MIN_VALUE;
        int length = 0;
        for(int i = number; i > 0; i = i / 10) {
            int temp = i % 10;
            length += 1;
            if(temp > max) {
                max = temp;
            }
        }
        System.out.println(max);

        int[] num_arr = new int[length];
        int temp = number;
        for(int i = length - 1; i >= 0; i--) {
            num_arr[i] = temp % 10;
            temp = temp / 10;
        }

        ArrayList<Integer> result = new ArrayList<Integer>();
        String num_str = Integer.toString(number);
        while(Integer.parseInt(num_str) > 0) {
            char[] chArr = num_str.toCharArray();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < length; i++) {
                if(chArr[i] == '0') {
                    sb.append("0");
                }
                else {
                    sb.append("1");
                }
            }
            String sub_str = sb.toString();
            number = Integer.parseInt(num_str) - Integer.parseInt(sub_str);
            num_str = Integer.toString(number);
            result.add(Integer.parseInt(sub_str));
        }

        for(int i: result) {
            System.out.print(i + " ");
        }

    }

    public static void main(String args[]) {

        int number = 726;
        solve(number);

    }

}



















