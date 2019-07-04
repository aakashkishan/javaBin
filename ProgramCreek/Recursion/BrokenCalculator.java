import java.util.*;

public class BrokenCalculator {

    static int minimum = Integer.MAX_VALUE;

    public static void recursiveCalculator(int n, int m, int min, boolean flag) {

        if(min > minimum) {
            return;
        }
        if(m == n) {
            minimum = Math.min(min, minimum);
        }
        if(m % 2 == 0) {
            if(flag == true) {
                recursiveCalculator(n, m / 2, min + 1, false);
                recursiveCalculator(n, m + 1, min + 1, false);
            }
            else {
                recursiveCalculator(n, m + 1, min + 1, true);
                recursiveCalculator(n, m / 2, min + 1, true);
            }
        }
        else {
            recursiveCalculator(n, m + 1, min + 1, true);
        }

    }

    public static void main(String args[]) {

        int n = 2;
        int m = 10;
        recursiveCalculator(n, m, 1, true);
        System.out.println("Number of Clicks on the Broken Calculator from N to M: " + --minimum);

    }

}
















