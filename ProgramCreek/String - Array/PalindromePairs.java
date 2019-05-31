import java.util.*;

public class PalindromePairs {

    public static List<List<Integer>> palindromePairs(String[] words) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(words == null || words.length == 0) {
            return result;
        }
        
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(int i = 0; i < words.length; i++) {
            hm.put(words[i], i);
        }
        
        for(int i = 0; i < words.length; i++) {
            
            String str = words[i];
            for(int k = 0; k <= str.length(); k++) {
                String left = str.substring(0, k);
                String right = str.substring(k);
                
                // If Left part is palindrome, find reversed Right part
                if(isPalindrome(left)) {
                    String reversed_right = new StringBuilder(right).reverse().toString();
                    if(hm.containsKey(reversed_right) && hm.get(reversed_right) != i) {
                        ArrayList<Integer> palindrome_index = new ArrayList<>();
                        palindrome_index.add(hm.get(reversed_right));
                        palindrome_index.add(i);
                        result.add(palindrome_index);
                    }
                }
                
                // If Right part is palindrome, find reversed Left part
                if(isPalindrome(right)) {
                    String reversed_left = new StringBuilder(left).reverse().toString();
                    if(hm.containsKey(reversed_left) && hm.get(reversed_left) != i && right.length() != 0) {
                        ArrayList<Integer> palindrome_index = new ArrayList<>();
                        palindrome_index.add(i);
                        palindrome_index.add(hm.get(reversed_left));
                        result.add(palindrome_index);
                    }
                }
            }
            
        }
        
        return result;
         
    }
    
    public static boolean isPalindrome(String str) {
        
        int i = 0;
        int j = str.length() - 1;
        while(i <= j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;   
    }

    public static void main(String args[]) {

        String[] words = new String[] {"bat", "tab", "cat"};
        List<List<Integer>> result = palindromePairs(words);
        System.out.println("The Palindrome Pairs: ");
        for(List<Integer> list: result) {
            for(int i: list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}


























