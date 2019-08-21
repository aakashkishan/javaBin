import java.util.*;
import java.util.Map.*;

public class IsStringRing {

    public static boolean getRing(String[] strs) {

        if(strs == null || strs.length == 0) {
            return false;
        }

        HashMap<Integer, Character> start_map = new HashMap<>();
        HashMap<Integer, Character> end_map = new HashMap<>();

        int index = 0;
        for(String str: strs) {
            start_map.put(index, str.charAt(0));
            end_map.put(index, str.charAt(str.length() - 1));
            index += 1;
        }

        int i = 0;
        index = 0;
        while(i < strs.length) {
            char end_char = end_map.get(index);
            for(Entry<Integer, Character> entry: start_map.entrySet()) {
                if(entry.getValue() == end_char) {
                    end_map.remove(index);
                    index = entry.getKey();
                    start_map.remove(index);
                    break;
                }
            }
            i += 1;
        }

        if(start_map.isEmpty() && end_map.isEmpty()) {
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String args[]) {

        String[] strs = new String[] {"cat", "table", "eat", "tic"};
        boolean isRing = getRing(strs);
        if(isRing == true) {
            System.out.println("The Strings form a Ring!");
        }
        else {
            System.out.println("The Strings cannot form a Ring :(");
        }

    }

}












