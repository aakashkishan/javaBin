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


        // ArrayList clone() function
        ArrayList backupList = new ArrayList();
        backupList = (ArrayList) studentList.clone();
        System.out.println("Cloned ArrayList: " + backupList);


        // ArrayList subList() function
        // subList() syntax - subList(int fromIndex, int toIndex)
        List<String> subList = studentList.subList(1, 3);
        System.out.println("Sub List of ArrayList: " + subList);


        // ArrayList toArray() function
        // Converts the ArrayList to Array
        Object[] subArray = subList.toArray();
        System.out.println("Array elements of subArray: " + Arrays.toString(subArray));


        // ArrayList size() function
        // Gets the number of elements in an ArrayList
        System.out.println("Number of Students: " + studentList.size());


        // ArrayList removeAll() function
        // Removes elements of ArrayList2 from ArrayList1
        ArrayList<String> removeList = new ArrayList<String>();
        removeList.add("Ram");
        removeList.add("Vishnu");
        studentList.removeAll(removeList);
        System.out.println("ArrayList after removal: " + studentList);


        // ArrayList get() function
        // get() syntax - get(int index)
        // Get a particular index value of an ArrayList
        System.out.println("Second Student: " + studentList.get(1));


        // ArrayList ensureCapacity() function
        // ensureCapacity() syntax - ensureCapacity(int minCapacity)
        // Increases capacity based on the minimum capacity specified
        studentList.ensureCapacity(3);
        studentList.add("Vishnu");
        System.out.println("Updated StudentList: " + studentList);


        // ArrayList iterator() function
        // Create an Iterator for the ArrayList
        Iterator<String> iter = studentList.iterator();
        System.out.println("The Elements of the Iterator: ");
        // Iterator functions hasNext() and next()
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }

    }

    public static void printMessage(String x) {

        System.out.println(x);

    }

}























