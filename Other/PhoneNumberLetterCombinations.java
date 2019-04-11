import java.util.*;

public class PhoneNumberLetterCombinations {

    public static Map<Character, char[]> getLetterMap() {
        Map<Character, char[]> letter_map = new HashMap<Character, char[]>();
        letter_map.put('0', new char[] {});
        letter_map.put('1', new char[] {});
        letter_map.put('2', new char[] {'a', 'b', 'c'});
        letter_map.put('3', new char[] {'d', 'e', 'f'});
        letter_map.put('4', new char[] {'g', 'h', 'i'});
        letter_map.put('5', new char[] {'j', 'k', 'l'});
        letter_map.put('6', new char[] {'m', 'n', 'o'});
        letter_map.put('7', new char[] {'p', 'q', 'r', 's'});
        letter_map.put('8', new char[] {'t', 'u', 'v'});
        letter_map.put('9', new char[] {'w', 'x', 'y', 'z'});

        return letter_map;
    }

    public static void recursiveLetterCombinations(String digits, List<String> result_list, 
                                                    Map<Character, char[]> letter_map, StringBuilder sb) {
        // If the letter sequence is as big as the digit sequence 
        if(sb.length() == digits.length()) {
            result_list.add(sb.toString());
            return;
        }

        // Loop through every digit to find the corresponding letter combination
        for(char ch : letter_map.get(digits.charAt(sb.length()))) {
            // Add that corresponding character to the string biuilder
            sb.append(ch);

            // Run the recursive function to do the same for the remainder of the sequence
            recursiveLetterCombinations(digits, result_list, letter_map, sb);

            // Once the recursive for the remainder of the sequence is over, clear that portion of the string builder
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static List<String> findLetterCombinations(String digits, List<String> result_list) {
        if(digits == null || digits.length() == 0) {
            result_list.add("");
            return result_list;
        }

        Map<Character, char[]> letter_map = getLetterMap();
        StringBuilder sb = new StringBuilder();

        recursiveLetterCombinations(digits,  result_list, letter_map, sb);

        return result_list;
    }

    public static void main(String args[]) {
        String digits = new String("23");
        List<String> result_list = new ArrayList<String>();

        result_list = findLetterCombinations(digits, result_list);
        System.out.println(result_list);
    }

}

























