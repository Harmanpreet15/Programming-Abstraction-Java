
public class Problem5 {
    public static void main(String[] args) {
        int n = 122563;

        String result = "";

        while(n > 0){
            int digit = n%10;

            if(!result.contains(String.valueOf(digit))){
                result = digit+result;
            }
            n = n/10;
        }
        System.out.println(result);
    }
}
