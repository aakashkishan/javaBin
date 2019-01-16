/* Objective - Print the Binary Representation of a number */


import java.lang.*;
import java.io.*;

public class binaryRepresentation {

    public static void main(String args[]) {

        int input = 43;
        System.out.println("The binary representation is : ");
        getBinary(input);

    }

    public static void getBinary(int input) {

        if(input > 1) {
            getBinary(input >>= 1);
        }
        System.out.print(input % 2);

    }

}



















