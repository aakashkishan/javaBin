import java.util.*;

public class FindFirstUniqueCharacter {

    public static Map<Character, Integer> findUniqueCharacter(String str) {

        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        Map<Character, Integer> result_hm = new HashMap<Character, Integer>();

        if(str == null || str.length() == 0) {
            result_hm.put(' ', 1);
            return result_hm;
        }

        char[] chArr = str.toCharArray();

        for(int i = 0 ; i < chArr.length; i++) {
            if(hm.containsKey(chArr[i])) {
                hm.put(chArr[i], hm.get(chArr[i]) + 1);
            } else {
                hm.put(chArr[i],  1);
            }
        }

        for(int i = 0; i < chArr.length; i++) {
            if(hm.get(chArr[i]) == 1) {
                result_hm.put(chArr[i], hm.get(chArr[i]));
                return result_hm;
            }
        }

        return result_hm;

    }

    public static void main(String args[]) {

        String str = "loveleetcode";
        Map<Character, Integer> hm = new HashMap<Character, Integer>();

        hm = findUniqueCharacter(str);
        System.out.println("The First Unique Character: " + hm);

    }

}






















