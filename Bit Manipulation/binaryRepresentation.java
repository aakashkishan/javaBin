/* Objective - Print the Binary Representation of a number */


import java.lang.*;
import java.io.*;

public class binaryRepresentation {

    public static void main(String args[]) {

        // int input = 15;
        System.out.println("The binary representation is : ");
        getBinaryRecursive(12);

    }

    public static void getBinaryRecursive(int input) {

        if(input > 1) {
            getBinaryRecursive(input >> 1);
        }
        System.out.print(input % 2);

    }

}



















