import java.util.*;

public class GroupStrings {

    public static List<List<String>> groupStrings(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

        for(String str: strs) {
            char[] chArr = str.toCharArray();
            if(chArr.length > 0) {
                int diff = chArr[0] - 'a';
                for(int i = 0; i < chArr.length; i++) {
                    if(chArr[i] - diff < 'a') {
                        // If the sequence goes around the alphabets after 'z'
                        chArr[i] = (char) (chArr[i] - diff + 26);
                    } 
                    // If the sequence is increasing alphabetically
                    else {
                        chArr[i] = (char) (chArr[i] - diff);
                    }
                }
            }

            String new_str = new String(chArr);
            if(map.containsKey(new_str)) {
                map.get(new_str).add(str);
            } else {
                ArrayList<String> str_al = new ArrayList<String>();
                str_al.add(str);
                map.put(new_str, str_al);
            }

        }

        for(Map.Entry<String, ArrayList<String>> entry: map.entrySet()) {
            Collections.sort(entry.getValue());
        }

        result.addAll(map.values());

        return result;

    }

    public static void main(String args[]) {

        String[] strings = new String[] {"abc", "bcd", "xyz", "az", "ba", "a", "z", "acef"};
        List<List<String>> result_strs = new ArrayList<>();
        result_strs = groupStrings(strings);
        System.out.println(result_strs);

    }

}
























