import java.util.*;
import java.io.*;

public class IntegerToRoman {

    public static String toRoman(int number) {

        int[] numerics = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < numerics.length; i++) {
            while(number - numerics[i] >= 0) {
                sb.append(romans[i]);
                number = number - numerics[i];
            }
        }

        return sb.toString();

    }

    public static void main(String args[]) {

       
        int number = 2123;
        String result_str = new String();

        result_str = toRoman(number);
        System.out.println(result_str);

    }

}















