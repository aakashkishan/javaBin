import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<List<String>>();
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(String str: strs) {
            char[] arr = new char[26];
            for(int i = 0; i < str.length(); i++) {
                arr[str.charAt(i) - 'a'] += 1;
            }
            String new_str = new String(arr);

            if(map.containsKey(new_str)) {
                map.get(new_str).add(str);
            }
            else {
                ArrayList<String> al = new ArrayList<String>();
                al.add(str);
                map.put(new_str, al);
            }
        }

        result.addAll(map.values());
        return result;

    }

    public static void main(String args[]) {

        String[] strs = new String[] {"gram", "rang", "marg"};
        List<List<String>> result = groupAnagrams(strs);
        for(int i = 0; i < result.size(); i++) {
            for(int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
        }

    }

}





















