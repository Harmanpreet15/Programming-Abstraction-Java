// Power of a Number

public class Q_5 {

    public static int power(int n, int p){
        if(p == 0){
            return 1;
        }

        return n * power(n, p-1);
    }
    public static void main(String[] args) {
        System.out.print(power(2, 5));
    }
}
