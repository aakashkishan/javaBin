import java.util.*;
import java.io.*;

public class FindSumPairs {

    class SumPair {
        int operand1, operand2;
        SumPair(int op1, int op2) {
            operand1 = op1;
            operand2 = op2;
        }
    };

    public ArrayList<Integer> findPairs(int arr[]) {

        ArrayList<Integer> result_al = new ArrayList<Integer>();
        Map<Integer, SumPair> map = new HashMap<Integer, SumPair>();

        for(int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                int sum = arr[i] + arr[j];
                if(!map.containsKey(sum)) {
                    SumPair sum_pair = new SumPair(arr[i], arr[j]);
                    map.put(sum, sum_pair);
                } else {
                    SumPair pair = map.get(sum);
                    // System.out.println(pair.operand1 + ", " + pair.operand2 + " = " + arr[i] + ", " + arr[j]);  
                    result_al.add(pair.operand1);
                    result_al.add(pair.operand2);
                    result_al.add(arr[i]);
                    result_al.add(arr[j]);
                }

            }

        }

        return result_al;

    }

    public static void main(String args[]) {

        int arr[] = {3, 4, 7, 1, 2, 9, 8};
        ArrayList<Integer> result_al = new ArrayList<Integer>();
        FindSumPairs object = new FindSumPairs();

        result_al = object.findPairs(arr);
        for(int i = 0; i < result_al.size(); i += 4) {
            System.out.println(result_al.get(i) + ", " + result_al.get(i + 1) + " = " + result_al.get(i + 2) + ", " + result_al.get(i + 3));
        }

    }

}



