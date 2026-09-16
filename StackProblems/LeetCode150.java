import java.util.*;

public class LeetCode150 {

    public static int ReversePolishNotation(String[] tokens){

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            if (!token.equals("+") &&
                !token.equals("-") &&
                !token.equals("*") &&
                !token.equals("/")) {

                stack.push(Integer.parseInt(token));
            }

            else {

                int b = stack.pop();
                int a = stack.pop();

                int result = 0;

                if (token.equals("+")) {
                    result = a + b;
                }
                else if (token.equals("-")) {
                    result = a - b;
                }
                else if (token.equals("*")) {
                    result = a * b;
                }
                else if (token.equals("/")) {
                    result = a / b;
                }

                stack.push(result);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        String[] tokens = {"2", "1", "+", "3", "*"};

        int answer = ReversePolishNotation(tokens);

        System.out.println("Answer = " + answer);
    }
}