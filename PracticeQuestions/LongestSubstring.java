import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";

        int left = 0;
        int right = 0;
        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();

        while(right < s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right-left+1);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }

        }
        System.out.println(maxLength);
    }
}
