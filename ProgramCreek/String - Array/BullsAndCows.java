import java.util.*;

public class BullsAndCows {

    public static String generateHint(String secret, String guess) {

        int bull_count = 0;
        int cow_count = 0;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        // Check Bull
        for(int i = 0; i < secret.length(); i++) {
            char ch1 = secret.charAt(i);
            char ch2 = guess.charAt(i);
            if(ch1 == ch2) {
                bull_count += 1;
            }
            else {
                if(hm.containsKey(ch1)) {
                    hm.put(ch1, hm.get(ch1) + 1);
                }
                else {
                    hm.put(ch1, 1);
                }
            }
        }

        // Check Cow
        for(int i = 0; i < guess.length(); i++) {
            char ch1 = secret.charAt(i);
            char ch2 = guess.charAt(i);
            if(ch1 != ch2) {
                if(hm.containsKey(ch2)) {
                    cow_count += 1;
                    if(hm.get(ch2) == 1) {
                        hm.remove(ch2);
                    }
                    else {
                        hm.put(ch2, hm.get(ch2) - 1);
                    }
                }
            }
        }

        return bull_count + "B" + cow_count + "C";

    }

    public static void main(String args[]) {

        String secret = "1807";
        String guess = "7810";
        String hint = generateHint(secret, guess);
        System.out.println("The Hint for the friend: " + hint);

    }

}




























