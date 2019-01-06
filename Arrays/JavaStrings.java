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

        /********* String Methods **********/
        //String Length
        String str = "Hey Mark, When should we meet?";
        int len = str.length();
        System.out.println("Length of String: " + len);

        //Characters at an index
        System.out.println("Character at Index 0: " + str.charAt(0) + str.charAt(len - 1));

        //UpperCase the string
        //toUpperCase() does not change the string forever, the String is immutable
        System.out.println("Upper Case String: " + str.toUpperCase());

        //Substring check
        //Use the contains() function
        System.out.println("Substring Check 'Mark': " + str.contains("Mark"));

        //Create a substring
        //Use the substring(startIndex, endIndex) function
        String temp1 = str.substring(3);
        String temp2 = str.substring(3, 20);
        System.out.println("Created Substring: " + temp1 + " | " + temp2);

        //Replace a character in the string
        //Use the replace('currentCharacter', 'replaceCharacter') function
        String temp3 = str.replace('M', 'L');
        System.out.println("Replaced string: " + temp3);

        //Replace a substring in the string
        //Use the replace("currentSequence", "replaceSequence") function
        String temp4 = str.replace("Mark", "Jack");
        System.out.println("REplaced StringSequence: " + temp4);

        //Convert Stirng into Character Array
        //Use the toCharArray() function
        char[] charArr = str.toCharArray();

        //Syntax: Foreach loop
        for(char ch : charArr) {
            System.out.print(ch + " ");
        }
        System.out.println();

        //Split the string
        //Use the split(splittingCharacter) function
        String[] strArr = str.split(" ");
        System.out.print("Splitting Sequences: ");
        for(String s : strArr) {
            System.out.println(s.trim());
        }

        //KINDA REGEX
        String email = "blahblah@test.com";

        //Email Validation
        if(!email.isEmpty()) {
            System.out.println("Email is available!");
            if(!email.contains("@") && !email.contains(".")) {
                System.out.println("But, Email is invalid");
            } else {
                System.out.println("Email is valid!");
            }
        } else {
            System.out.println("Enter Email: ");
        }

        //Strings are Immutable
        //Use the concat() function
        String string = new String("Hello");
        //Like using the '+' operator
        string.concat(" World");
        System.out.println("Concatenated String: " + string);

        //But, String Buffers are mutable
        //Use the append function and the StringBuffer Class
        StringBuffer strBuffer = new StringBuffer("Hello");
        strBuffer.append(" World");
        System.out.println("Concatenated Buffer: " + strBuffer);

        //String Builders are the same as String Buffers, but they are not thread-safe
        StringBuilder strBuilder = new StringBuilder("Hello");
        strBuilder.append(" World Builders");
        System.out.println("Concatenated Builders: " + strBuilder);

        //Run-Time Polymorphism
        CharSequence chSeq = null;
        chSeq = new String("Hi");
        chSeq = new StringBuffer("Hello");
        chSeq = new StringBuilder("How are you?");



    }

}











