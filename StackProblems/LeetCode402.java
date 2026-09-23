import java.util.*;

public class LeetCode402{

    public static String removeKdigits(String num, int k) {

        Stack<Character> stack = new Stack<>();

        for(char ch : num.toCharArray()){
            while(k>0 && !stack.isEmpty() && stack.peek()>ch){
                stack.pop();
                k--;
            }
            stack.push(ch);
        }

        while (k>0) {
            stack.pop();
            k--;
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        result.reverse();


        int i=0;
        while(i<result.length() && result.charAt(i) == '0'){
            i++;
        }

        result = new StringBuilder(result.substring(i));

        return result.length()==0 ? "0" : result.toString();
    }

    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        System.out.println(removeKdigits(num, k));
    }

}