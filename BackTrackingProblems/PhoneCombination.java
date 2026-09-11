// LETTER COMBINATION OF A PHONE NUMBER
// LEETCODE - 17

import java.util.*;

public class PhoneCombination {

    public static void backTrack(String digits, int index, StringBuilder curr, String[] phone, List<String> ans){
        if(index == digits.length()){
            ans.add(curr.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = phone[digit];

        for(int i=0; i<letters.length(); i++){
            curr.append(letters.charAt(i));
            backTrack(digits, index+1, curr, phone, ans);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
    public static void main(String[] args) {
        String digits = "23";
        List<String> ans = new ArrayList<>();

        String[] phone = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backTrack(digits, 0, new StringBuilder(), phone, ans);
        System.out.println(ans);
    }
}
