import java.lang.*;

public class replaceCharacter {

    public static void main(String args[]) {

        String str = "Hello! Good Morning! Have a good day!";
        String targetStr = " ";
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + replaceChar(str.trim(), targetStr));

    }

    public static String replaceChar(String str, String targetStr) {

        int len = str.length();
        String replaceStr = "%20";
        String[] strArr = str.split(targetStr);
        String result = "";

        int counter = 0;
        for(int i = 0; i < strArr.length; i++) {
            if(i != strArr.length - 1) {
                result += strArr[i] + replaceStr;
            } else {
                result += strArr[i];
            }
        }

        return result;
    }

}



















