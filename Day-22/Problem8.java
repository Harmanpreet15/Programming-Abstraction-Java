

public class Problem8 {
    public static void main(String[] args) {
        int[] arr = {4,2,6,5,8};
        int maxelement = arr[0];
        int secelement = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > maxelement){
                secelement = maxelement;
                maxelement = arr[i];
            }
            if(arr[i] > secelement && arr[i] != maxelement){
                secelement = arr[i];
            }
        }

        System.out.println(secelement);
    }
}
