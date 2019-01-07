import java.lang.*;



public class palindromeCheck {

    public static void main(String args[]) {

        String str = "muggum";
        System.out.println("Original String: " + str);
        System.out.println("Palindrome Check: " + checkPalindrome(str.toLowerCase()));

    }

    public static String checkPalindrome(String str) {

        int length = str.length();
        char[] chArr = new char[length];
        chArr = str.toCharArray();

        int flag = 0;

        for(int i = 0; i < length / 2; i++) {
            if(chArr[i] != chArr[length - 1 - i]) {
                flag = 1;
                break;
            }
        }

        if(flag == 1) {
            return "Fail";
        } else {
            return "Pass";
        }

    }

}































