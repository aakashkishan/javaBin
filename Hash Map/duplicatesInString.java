import java.util.HashMap;

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

        System.out.println(hm);


    }

    public static void main(String args[]) {

        String str1 = "I am am a I monkey";
        findDuplicateWords(str1);

    }

}












