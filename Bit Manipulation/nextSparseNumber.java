/* Objective - Find the next sparse number after the input number
   NOTE : A number is said to be sparse if its bit representation has 101 form.
   Example1 - Input : x = 6
              Output : Next Sparse Number is 8
   Example2 - Input : x = 4
              Output : Next Sparse Number is 4 */

public class nextSparseNumber {

    public static void main(String args[]) {

        int input = 6;
        System.out.println("Next Sparse number is : " + getSparseNumber(input));        

    }

    public static int getSparseNumber(int input) {

        int temp = input;
        int bitMask = 0x11;
        // int flag = 0;

        // while(input != 0) {
            // temp = input;
        //     flag = 0;
        //     System.out.println("Outer Loop");
            while(temp != 0) {
                System.out.println("Inner Loop " + temp);
                if((int) (temp & bitMask) == 1) {
                    System.out.println("Check Condition");
                    input += 1;
                    temp = input;
                    // flag = 1;
                    continue;
                }
                temp >>= 1;
            }
        //     if(flag == 0) {
        //         return input;
        //     }
        // }

        return input;
    }

}



















