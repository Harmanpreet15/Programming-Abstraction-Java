import java.util.HashSet;

public class VariableSizeSW {
    
    public static int lengthOf(String s){
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for(int right = 0; right<s.length(); right++){
            char curr = s.charAt(right);

            while(set.contains(curr)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(curr);
            maxLength = Math.max(maxLength, right-left+1);
        }

        return maxLength;

    }

    public static void main(String[] args){
        String s = "abcabcbb";
        System.out.println(lengthOf(s));
    }
}
