import java.util.*;

public class ReverseVowelsOfString {

    public static String reverseVowels(String str) {

        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        ArrayList<Character> vowel_list = new ArrayList<Character>();
        vowel_list.addAll(vowels);
        char[] chArr = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while(left < right) {
            // Increment left until a vowel
            if(!vowel_list.contains(chArr[left])) {
                left += 1;
                continue;
            }

            // Decrement right until a vowel
            if(!vowel_list.contains(chArr[right])) {
                right -= 1;
                continue;
            }

            // If a vowel on left and right pointers
            char temp = chArr[left];
            chArr[left] = chArr[right];
            chArr[right] = temp;

            left += 1;
            right -= 1;

        }

        return new String(chArr);

    }

    public static void main(String args[]) {

        String str = "Paypal Is Hiring";
        String result_str = reverseVowels(str);
        System.out.println("The String with the Reversed Vowels: " + result_str);

    }

}

































