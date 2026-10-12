import java.util.*;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "madam";

        Deque<Character> dq = new ArrayDeque<>();

        for(int i=0; i<s.length(); i++){
            dq.addFirst(s.charAt(i));
        }

        int i=0;
        boolean isPalindrome = true;
        while(!dq.isEmpty() && i != s.length()){
            if(dq.removeFirst() != s.charAt(i)){
                isPalindrome = false;
                break;
            }
            i++;
        }

        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
