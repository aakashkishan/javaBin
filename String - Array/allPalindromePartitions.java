/* Objective - Given a string, print all possible palindrome partitions 
   Example - Input : nitin
             Output : n i t i n
                      n iti n
                      nitin */

import java.lang.*;
import java.io.*;
import java.util.*;

public class allPalindromePartitions {

    public static void main(String args[]) {

        String str = "level";
        ArrayList<ArrayList<String>> partitions = new ArrayList<>();
        partitionString(str, partitions);

    }

    public static void partitionString(String str, ArrayList<ArrayList<String>> partitions) {

        // Temporary ArrayList to store each partition
        ArrayList<String> temp = new ArrayList<>();

        // Add all the palindrome parition strings
        partitions = addPartitionStrings(partitions, str, temp, 0);

        printResult(partitions);

    }

    public static ArrayList<ArrayList<String>> addPartitionStrings(ArrayList<ArrayList<String>> partitionStrings,
                                                String str, ArrayList<String> temp, int index) {

        int len = str.length();
        String string = "";
        ArrayList<String> currentString = new ArrayList<>(temp);

        if(index == 0) {
            temp.clear();
        }

        for(int i = index; i < len; i++) {
            string = string + str.charAt(i);
            
            if(checkPalindrome(string)) {
                // If palindrome add to the temp list
                temp.add(string);

                if(i + 1 < len) {
                    // Recursion to get all palindrome partitions for the subStrings
                    partitionStrings = addPartitionStrings(partitionStrings, str, temp, i + 1);
                } 
                else {
                    // If end of string, then add temp to partitionStrings
                    partitionStrings.add(temp);
                }

                // Temp is reinstantiated with current i
                temp = new ArrayList<>(currentString);

            }
        }

        return partitionStrings;

    }

    public static boolean checkPalindrome(String str) {

        int len = str.length();
        len -= 1;

        for(int i = 0; i < len; i++) {
            if(str.charAt(i) != str.charAt(len)) {
                return false;
            }
            len -= 1;
        }
        return true;

    }

    public static void printResult(ArrayList<ArrayList<String>> partitions) {

        for(ArrayList<String> str : partitions) {
            for(String str2 : str) {
                System.out.print(str2 + " ");
            }
            System.out.println();
        }

    }


}






























