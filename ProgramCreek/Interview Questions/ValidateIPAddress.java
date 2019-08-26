import java.util.*;

public class ValidateIPAddress {

    public static boolean checkIPv4(String IP) {

        if(IP.charAt(IP.length() - 1) == '.') {
            return false;
        }

        String[] classes = IP.split("\\.");
        if(classes == null || classes.length < 3) {
            return false;
        }

        for(String str: classes) {
            if(str == null || str.length() == 0 || str.length() > 3) {
                return false;
            }
            if (str.length() > 1 && str.charAt(0) == '0') {
                return false;
            }
            int val = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c < '0' || c > '9') {
                    return false;
                }
                val = val * 10 + (int) (c - '0');
            }
            if (val < 0 || val > 255) {
                return false;
            }
        }
        return true;

    }

    public static boolean checkIPv6(String IP) {

        if (IP.charAt(IP.length() - 1) == ':') {
            return false;
        }
        String[] numbers = IP.split(":");
        if (numbers == null || numbers.length != 8) {
            return false;
        }
        for (String str : numbers) {
            if (str.length() == 0 || str.length() > 4) {
                return false;
            }
            int i = 0;
            while (i < str.length()) {
                char c = str.charAt(i++);
                if ((c < '0' || c > '9') && (c < 'a' || c > 'f') && (c < 'A' || c > 'F')) {
                    return false;
                }
            }
        }
        return true;

    }

    public static String validateIP(String IP) {

        if(IP == null || IP.length() == 0) {
            return "Neither";
        }

        boolean isIPv4 = checkIPv4(IP);
        boolean isIPv6 = checkIPv6(IP);

        if(isIPv4) {
            return "IPv4";
        }
        else if(isIPv6) {
            return "IPv6";
        }
        else {
            return "Neither";
        }

    }

    public static void main(String args[]) {

        String IP = "198.255.2.16";
        String answer = validateIP(IP);
        System.out.println("The IP Type: " + answer);

    }

}














