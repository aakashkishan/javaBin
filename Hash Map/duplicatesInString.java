import java.util.HashMap;
import java.util.Iterator;

public class duplicatesInString {

    public static void findDuplicateWords(String str) {

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        String[] strings = str.split(" ");

        for(String string: strings) {

            // Check if the value for the 'striing' key already exists
            // If it does exist, then increment the value by 1
            // Syntax: hm.get(key) = value
            if(hm.get(string) != null) {
                hm.put(string, hm.get(string) + 1);
            } 
            
            // If the value for the 'string' key is not set, then set value to 1
            else {
                hm.put(string, 1);
            }

        }

        // Print only the duplicate words
        // The below statement creator an iterator of type string 
        // for all the keyset in the HashMap
        Iterator<String> string = hm.keySet().iterator();
        while(string.hasNext()) {
            String temp = string.next();
            if(hm.get(temp) > 1) {
                System.out.println(temp + " is duplicated " + hm.get(temp) + " times");
            }
        }



    }

    public static void findDuplicateChars(String str) {

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                continue;
            } 
            else if(hm.get(str.charAt(i)) != null) {
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
            } 
            else {
                hm.put(str.charAt(i), 1);
            }
        }

        Iterator<Character> chr = hm.keySet().iterator();
        while(chr.hasNext()) {
            Character ch = chr.next();
            if(hm.get(ch) > 1) {
                System.out.println(ch + " is duplicated " + hm.get(ch) + " times");
            }
        }

    }

    public static void main(String args[]) {

        String str1 = "I am am a monkey monkey";
        String str2 = "javaj2ee";
        System.out.println("Duplicate Words:");
        findDuplicateWords(str1);
        System.out.println("Duplicate Chars:");
        findDuplicateChars(str2);

    }

}












