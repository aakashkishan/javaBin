import java.util.*;

class Solution {

    public void helper(String digits, int index, HashMap<Character, char[]> map, List<String> result, char[] arr) {

        if(index == digits.length()) {
            result.add(new String(arr));
            return;
        }

        char number = digits.charAt(index);
        char[] letters = map.get(number);
        for(int j = 0; j < letters.length; j++) {
            arr[index] = letters[j];
            helper(digits, index + 1, map, result, arr);
        }

    }

    public List<String> getLetterCombination(String digits) {
        
        List<String> result = new ArrayList<String>();
        if(digits == null || digits.length() == 0) {
            return result;
        }

        HashMap<Character, char[]> map = new HashMap<Character, char[]>();
        map.put('2',new char[]{'a','b','c'});
        map.put('3',new char[]{'d','e','f'});
        map.put('4',new char[]{'g','h','i'});
        map.put('5',new char[]{'j','k','l'});
        map.put('6',new char[]{'m','n','o'});
        map.put('7',new char[]{'p','q','r','s'});
        map.put('8',new char[]{'t','u','v'});
        map.put('9',new char[]{'w','x','y','z'});

        char[] arr = new char[digits.length()]; 
        helper(digits, 0, map, result, arr);
        return result;

    }

}

public class LetterCombinationPhone {

    public static void main(String args[]) {

        String digits = "367";
        List<String> strings = new Solution().getLetterCombination(digits);
        System.out.println("The Letter Combinations: ");
        for(String str: strings) {
            System.out.print(str + " ");
        }

    }

}




















