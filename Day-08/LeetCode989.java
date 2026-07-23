import java.util.*;

public class LeetCode989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int sum = 0;
        int carry = 0;
        int i = num.length-1;
        List<Integer> x = new ArrayList<>();

        while(k!=0 || carry > 0 || i>=0){
            int num_digit = (i>=0) ? num[i] : 0;
            sum = num_digit + carry + (k%10);
            x.add(sum%10);
            carry = sum/10;
            k = k/10;
            i--;
        }

        Collections.reverse(x);

        return x;
    }

    public static void main(String[] args) {
        LeetCode989 obj = new LeetCode989();
        int[] num = {1,2,0,0};
        int k = 34;
        List<Integer> result = obj.addToArrayForm(num, k);
        System.out.println(result); // Output: [1, 2, 3, 4]
    }
}