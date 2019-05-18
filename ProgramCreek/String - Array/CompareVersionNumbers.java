import java.util.*;

public class CompareVersionNumbers {

    public static int compareVersion(String version1, String version2) {

        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");

        int i = 0;
        while(i < arr1.length || i < arr2.length) {
            // When both arrays exist
            if(i < arr1.length && i < arr2.length) {
                if(Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i])) {
                    return -1;
                }
                else if(Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i])) {
                    return 1;
                }
            }

            // When arr1 alone exists
            else if(i < arr1.length) {
                if(Integer.parseInt(arr1[i]) != 0) {
                    return 1;
                }
            }

            // When arr2 alone exists
            else if(i < arr2.length) {
                if(Integer.parseInt(arr2[i]) != 0) {
                    return -1;
                }
            }

            i += 1;
        }

        return 0;

    }

    public static void main(String args[]) {

        String version1 = "1.2";
        String version2 = "1.1";
        int compare = compareVersion(version1, version2);
        System.out.println("Compare between the two versions: " + compare);

    }

}



















