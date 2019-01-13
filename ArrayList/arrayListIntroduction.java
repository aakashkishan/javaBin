import java.lang.*;
import java.io.*;
import java.util.*;

public class arrayListIntroduction {

    public static void main(String args[]) throws IOException {

        int n = 5;

        ArrayList<Integer> arrList = new ArrayList<Integer>(n);
        for(int i = 1; i <= n; i++) {
            arrList.add(i);
        }

        System.out.println(arrList);
        // Argument passed to remove is the Index of the ArrayList
        arrList.remove(4);
        System.out.println(arrList);

        System.out.println("Elements of ArrayList: ");
        for(int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i) + " ");
        }

        // ********************* ARRAYLIST METHODS *************************
        ArrayList<String> studentList = new ArrayList<String>(n);
        String[] strArr = {"Ram", "Gopal", "Verma", "Rohit"};

        for(String str : strArr) {
            studentList.add(str);
        }

        System.out.println("Student Names: ");
        // ArrayList forEach() function
        studentList.forEach((x) -> printMessage(x));


        // ArrayList set() function
        // set() syntax - set(int index, element E)
        // Replace an element in the ArrayList
        System.out.println("Before Replacement: " + studentList);
        studentList.set(2, "Vishnu");
        System.out.println("After Replacement: " + studentList);

    }

    public static void printMessage(String x) {

        System.out.println(x);

    }

}























