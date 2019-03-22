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

    public static void main(String args[]) {

        String str1 = "I am am a monkey monkey";
        findDuplicateWords(str1);

    }

}












