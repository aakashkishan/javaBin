import java.lang.*;

public class JavaStrings {

    public static void main(String args[]) {

        String str1 = "Hello";
        String str2 = "Hello";

        // == operator compares the reference and not the content
        // Equal because both of them are stores inside the string pool and have the same reference pool address
        if(str1 == str2) {
            System.out.println("1 and 2 stirngs are equal");
        } else {
            System.out.println("1 and 2 strings are unequal");
        }

        String str3 = new String("Hello"); 
        String str4 = new String("Hello");

        // Strings are unequal becuase they are not stored inside the pool and have different addresses
        if(str3 == str4) {
            System.out.println("3 and 4 strings are equal!");
        } else {
            System.out.println("3 and 4 strings are unequal!!");
        }

        // So for string comparison use equals() function or compareTo() function
        if(str3.equals(str4) || str3.compareTo(str4) == 0) {
            System.out.println("5 and 6 strings are equal!");
        } else {
            System.out.println("5 and 6 strings are not equal!1");
        }

    }

}











