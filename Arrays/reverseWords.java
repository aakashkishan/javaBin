import java.lang.*;

public class reverseWords {

    public static void main(String args[]) {

        String sentence = "Hello, Have a nice day";
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Reversed Sentence: " + sentenceReverse(sentence.trim()));

    }

    public static String sentenceReverse(String sentence) {

        String[] words = sentence.split(" ");
        String reverseSentence = "";

        for(int i = words.length - 1; i >= 0; i--) {
            if(i != 0) {
                reverseSentence += words[i] + " ";
            } else {
                reverseSentence += words[i];
            } 
        }

        return reverseSentence;
    }

}






















