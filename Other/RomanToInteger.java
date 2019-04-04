import java.util.*;

public class RomanToInteger {

    public static int findNumber(String roman) {

        int number = 0;

        if(roman == null || roman.length() == 0) {
            return number;
        }

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int length = roman.length();
        number = map.get(roman.charAt(length - 1));

        for(int i = length - 2; i >= 0; i--) {

            if(map.get(roman.charAt(i)) >= map.get(roman.charAt(i + 1))) {
                number += map.get(roman.charAt(i));
            } else {
                number -= map.get(roman.charAt(i));
            }

        }

        return number;

    }

    public static void main(String args[]) {

        String roman = new String("MMCXXIII");
        int number = 0;

        number = findNumber(roman);
        System.out.println("The number for the roman sequence: " + number);

    }

}











