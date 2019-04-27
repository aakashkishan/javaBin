// Given two words (start and end), and a dictionary, find the length of shortest transformation sequence from start to end, 
// such that only one letter can be changed at a time and each intermediate word must exist in the dictionary.
import java.util.*;

class WordNode {
    String word;
    int number_steps;
    public WordNode(String w, int n) {
        this.word = w;
        this.number_steps = n;
    }
}

public class WordLadderBFS {

    public static int ladderLength(String start_word, String end_word, Set<String> word_dict) {

        if(start_word == null || start_word.length() == 0 || end_word == null || end_word.length() == 0) {
            return 0;
        }

        LinkedList<WordNode> queue = new LinkedList<WordNode>();
        queue.add(new WordNode(start_word, 1));
        word_dict.add(end_word);

        while(!queue.isEmpty()) {
            WordNode top_node = queue.remove();
            String curr_word = top_node.word;

            // If curr_word is the same as end_word, then return the corresponding ladder length
            if(curr_word.equals(end_word)) {
                return top_node.number_steps;
            }

            char[] chArr = curr_word.toCharArray();
            for(int i = 0; i < chArr.length; i++) {
                for(char ch = 'a'; ch < 'z'; ch++) {
                    char temp = chArr[i];

                    // Change to new_word if new_word not equal to curr_word
                    if(ch != chArr[i]) {
                        chArr[i] = ch;
                    }

                    String new_word = new String(chArr);
                    // If new word in dictionary, then add that word node to the queue and remove it from the dictionary
                    if(word_dict.contains(new_word)) {
                        queue.add(new WordNode(new_word, top_node.number_steps + 1));
                        word_dict.remove(new_word);
                    }
                    // If the word not in word_dict, then revert back to the curr_word
                    chArr[i] = temp;
                }
            }
        }

        // In case of other exceptions
        return 0;

    }

    public static void main(String args[]) {

        String start_word = "hit";
        String end_word = "cog";
        Set<String> word_dict = new HashSet<String>(Arrays.asList("hot", "lot", "log", "dog", "dot"));
        int num_of_steps = 0;
        num_of_steps = ladderLength(start_word, end_word, word_dict);
        System.out.print("The number of steps from start to end: " + num_of_steps);

    }

}































