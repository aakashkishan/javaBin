import java.util.*;

public class PascalsTriangleRow {

    public static ArrayList<Integer> pascalRow(int row_index) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        if(row_index < 0) {
            return result;
        }

        result.add(1);
        for(int i = 1; i <= row_index; i++) {
            for(int j = result.size() - 2; j >= 0; j--) {
                result.set(j + 1, result.get(j) + result.get(j + 1));
            }
            result.add(1);
        }

        return result;

    }

    public static void main(String args[]) {

        int row_index = 3;
        ArrayList<Integer> result_row = pascalRow(row_index);
        System.out.println("The Pascal's Triangle Row: ");
        for(int i: result_row) {
            System.out.print(i + " ");
        }

    }

}





























