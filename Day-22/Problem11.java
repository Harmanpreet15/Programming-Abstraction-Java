

public class Problem11 {
    public static void main(String[] args) {
        for(int i=1; i<=6; i++){
            if(i > 3){
                for(int j=3; j<=i; j++){
                    System.out.print("*");
                }
            }else{
                for(int j=5; j>=i; j--){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
