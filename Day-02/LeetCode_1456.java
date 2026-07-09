public class LeetCode_1456 {

    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u';
    }

    public static int maxVowels(String s, int k) {

        int vowelCount = 0;

        for(int i=0; i<k; i++){
            if(isVowel(s.charAt(i))){
                vowelCount++;
            }
        }

        int maxCount = vowelCount;

        for(int i=k; i<s.length(); i++){
            if(isVowel(s.charAt(i))){
                vowelCount +=1;
            }

            if(isVowel(s.charAt(i-k))){
                vowelCount -=1;
            }

            maxCount = Math.max(vowelCount, maxCount);
        }

        return maxCount;
    }
    public static void main(String[] args){
        String s = "abciiidef";
        int k = 3;
        System.out.print(maxVowels(s, k));
    }
    
}
