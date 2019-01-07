import java.lang.*;

public class vowelConsonants {

    public static void main(String args[]) {

        String str = "Good Morning!";

        int[] result = checkString(str);
        System.out.println("Vowels: " + result[0] + "\nConsonants: " + result[1]);

    }

    public static int[] checkString(String str) {

        int length = str.length();

        String vowels = "aeiou";
        char[] vowelArr = new char[vowels.length()];
        vowelArr = vowels.toCharArray();

        String consonants = "bcdfghjklmnpqrstvwxyz";
        char[] consoArr = new char[consonants.length()];
        consoArr = consonants.toCharArray();

        char[] strArr = new char[length];
        strArr = str.toCharArray();

        int[] result = new int[2];
        for(int i = 0; i < 2; i++) {
            result[i] = 0;
        }

        // Aplhabets between 65 and 90 or 97 and 122
        for(char ch : strArr) {
            // Vowel Check
            for(char vow : vowelArr) {
                if(Character.toString(ch).equals(Character.toString(vow))) {
                    result[0] += 1;
                }
            }

            // Consonant Check
            for(char con : consoArr) {
                if(Character.toString(ch).equals(Character.toString(con))) {
                    result[1] += 1;
                }
            }
        }

        return result;
    }

}


























