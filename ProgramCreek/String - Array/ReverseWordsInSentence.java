import java.util.*;

public class ReverseWordsInSentence {

    public static ArrayList<String> reverseWords(String sentence) {

        ArrayList<String> result_al = new ArrayList<String>();
        if(sentence == null || sentence.length() == 0) {
            return result_al;
        }

        int ptr1 = 0;
        int ptr2 = 0;
        for(int i = 0; i < sentence.length(); i++) {

            if(sentence.charAt(i) == ' ' || sentence.charAt(i) == '.') {
                result_al.add(sentence.substring(ptr1, ptr2+1));
                ptr1 = i+1;
                ptr2 = i+1;
            }
            ptr2 = i;
        }

        return result_al;

    }

    public static void main(String args[]) {

        String sentence = "The sky is blue.";
        ArrayList<String> words = new ArrayList<String>();
        words = reverseWords(sentence);
        Collections.reverse(words);

        StringBuilder reverse_sentence = new StringBuilder(100);
        for(String str : words) {
            reverse_sentence.append(' ').append(str);
        }
        reverse_sentence.append('.');
        System.out.print(reverse_sentence.toString());

    }

}






















