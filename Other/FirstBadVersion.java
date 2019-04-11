import java.util.*;

public class FirstBadVersion {


    public static boolean isBadVersion(int version, int[] badVersions) {
        boolean isBad = false;
        if(badVersions[version - 1] == 1) {
            isBad = true;
        }

        return isBad;
    }

    // Use Binary Search
    public static int findFirstBadVersion(int[] badVersions) {

        int start = 1;
        int end = badVersions.length;

        while(start + 1 < end) {
            int mid = start + (end - start) / 2;

            if(isBadVersion(mid, badVersions)) {
                end = mid;
            } else {
                start = mid;
            }
        }

        if(isBadVersion(start, badVersions)) {
            return start;
        }

        return end;

    }

    public static void main(String args[]) {

        // The '0' is for corresponding good versions, while '1' is for bad versions
        int[] badVersions = new int[] {0, 0, 0, 0, 1, 1, 1, 1};

        System.out.println("The First Bad Version: " + findFirstBadVersion(badVersions));

    }

}




