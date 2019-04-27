import java.util.*;

public class EvaluateReversePolishNotation {

    public static int evaluateRPN(String[] tokens) {

        int result_value = 0;
        String operators = "+-*/";
        Stack<String> stack = new Stack<String>();
        
        for(String token : tokens) {
            // If not an Operator, Push to Stack
            if(!operators.contains(token)) {
                stack.push(token);
            } 
            else {
                int operand1 = Integer.valueOf(stack.pop());
                int operand2 = Integer.valueOf(stack.pop());
                int operator_index = operators.indexOf(token);
                switch(operator_index) {
                    // In case of Addition
                    case 0:
                        stack.push(String.valueOf(operand1 + operand2));
                        break;
                    // In case of Subtraction
                    case 1:
                        stack.push(String.valueOf(operand2 - operand1));
                        break;
                    // In case of Multiplication
                    case 2:
                        stack.push(String.valueOf(operand1 * operand2));
                        break;
                    // In case of Division
                    case 3:
                        stack.push(String.valueOf(operand2 / operand1));
                        break;
                }
            }
        }

        result_value = Integer.valueOf(stack.pop());
        return result_value;

    }

    public static void main(String args[]) {

        String[] tokens = new String[] {"4", "13", "5", "/", "+"};
        int eval_result = 0;
        eval_result = evaluateRPN(tokens);
        System.out.print("Evaluation Result: " + eval_result);

    }

}
























