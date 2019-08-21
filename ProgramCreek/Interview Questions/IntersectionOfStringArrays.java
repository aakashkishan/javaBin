import java.util.*;


public class IntersectionOfStringArrays {

    public static List<String> getIntersection(String[] strs1, String[] strs2) {

        List<String> result_strings = new ArrayList<String>();
        if(strs1 == null || strs1.length == 0 || strs2 == null || strs2.length == 0) {
            return result_strings;
        }

        HashSet<String> string_set = new HashSet<>();
        for(String str: strs1) {
            string_set.add(str);
        }

        for(String str: strs2) {
            if(string_set.contains(str)) {
                result_strings.add(str);
            }
        }

        return result_strings;

    }

    public static void main(String args[]) {

        String[] strs1 = new String[] {"Ram", "Laxman", "Bharath"};
        String[] strs2 = new String[] {"Seetha", "Ram", "Raju"};
        List<String> string_intersection = getIntersection(strs1, strs2);
        System.out.println("The Intersection of String Arrays: ");
        for(String str: string_intersection) {
            System.out.print(str + " ");
        }

    }

}