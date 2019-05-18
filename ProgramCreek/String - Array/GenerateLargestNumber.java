import java.util.*;

public class GenerateLargestNumber {

    public static String generateLargestNumber(int[] nums) {

        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, new Comparator<String>() {
            public int compare(String str1, String str2) {
                return (str2 + str1).compareTo(str1 + str2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String str: strs) {
            sb.append(str);
        }

        while(sb.charAt(0) == '0' && sb.length() > 1) {
            sb.deleteCharAt(0);
        }
        return sb.toString();

    }

    public static void main(String args[]) {

        int[] nums = new int[] {3, 30, 34, 5, 9};
        String largest_number = generateLargestNumber(nums);
        System.out.println("The Largest Number Generated: " + largest_number);

    }

}
























