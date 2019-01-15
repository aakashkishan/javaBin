/* Objective - Print all the sub-sequences of a string */

import java.lang.*;
import java.io.*;

// ArrayList is imported using the java.util.ArrayList
import java.util.*;

public class AllSubSequences {

    public static void main(String arsg[]) {

        String str = "geek";
        ArrayList<String> arrList = getSubSequences(str);

        arrList.remove("");
        System.out.println("All possible sub-sequences of String: ");
        for(int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }

    }

    public static ArrayList<String> getSubSequences(String str) {

        // Null string condition
        if(str.length() == 0) {
            ArrayList<String> nullList = new ArrayList<String>();
            nullList.add("");
            return nullList;
        }

        // Take a character
        char ch = str.charAt(0);

        // Take the sub-string starting from the index after the character ch
        String subStr = str.substring(1);

        // Recursively call for all sub-sequences from the second charvaacter
        ArrayList<String> subSequenceList = getSubSequences(subStr);

        // Create a new resultant array list to hold all possible sub sequences
        ArrayList<String> resultList = new ArrayList<String>();

        // Add the subSequences from the subSequenceList to the resultList
        // And also add the character + subSequences from the subSequenceList to the resultList
        for(String subSeq : subSequenceList) {
            resultList.add(subSeq);
            resultList.add(ch + subSeq);
        }

        return resultList;

    }

}
















