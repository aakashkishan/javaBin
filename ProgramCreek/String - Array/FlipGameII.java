import java.util.*;

public class FlipGameII {

    public static boolean getFlipResult(String str) {

        List<String> result = new ArrayList<String>();
        if(str == null || str.length() == 0) {
            return false;
        }

        char[] chArr = str.toCharArray();
        for(int i = 0; i < str.length() - 1; i++) {
            if(chArr[i] == '+' && chArr[i + 1] == '+') {
                chArr[i] = '-';
                chArr[i + 1] = '-';
                result.add(new String(chArr));
                chArr[i] = '+';
                chArr[i + 1] = '+';
            }
        }

        for(String s: result) {
            int flag = 1;
            char[] arr = s.toCharArray();
            for(int i = 0; i < arr.length - 1; i++) {
                if(arr[i] == '+' && arr[i + 1] == '+') {
                    flag = 0;
                }

                if(i == arr.length - 2 && flag == 1) {
                    return true;
                }

            }
        }

        return false;

    }

    public static void main(String args[]) {

        String str = "++++";
        boolean isWin = getFlipResult(str);
        if(isWin == true) {
            System.out.println("The Starting Player Can Win!");
        }
        else {
            System.out.println("The Starting Player Cannot Win :(");
        }

    }

}
























