// Toggle character

public class Problem3 {
    public static void main(String[] args) {
        String string = "HarmanPreetKaur";
        String result = "";

        for(char s : string.toCharArray()){
            if(Character.isLowerCase(s)){
                result += Character.toUpperCase(s);
            }else{
                result += Character.toLowerCase(s);
            }
        }

        System.out.println(result);
    }
}
