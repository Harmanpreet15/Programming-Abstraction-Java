// Leetcode 394 ---> "DECODE STRING"

import java.util.*;

public class LeetCode394 {

    public static String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        StringBuilder current = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '[') {

                countStack.push(num);
                stringStack.push(current.toString());

                num = 0;
                current.setLength(0);
            }

            else if (ch == ']') {

                int count = countStack.pop();
                String previous = stringStack.pop();

                StringBuilder temp = new StringBuilder(previous);

                for (int i = 0; i < count; i++) {
                    temp.append(current);
                }

                current = temp;
            }

            else {
                current.append(ch);
            }
        }

        return current.toString();
    }


    public static void main(String[] args) {

        String s = "3[a2[c]]";

        String answer = decodeString(s);

        System.out.println("Decoded String: " + answer);
    }
}

