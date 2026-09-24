import java.util.StringTokenizer;

// public class Problem7 {
//     public static void main(String[] args) {
//         String s = "My name is harman";

//         StringTokenizer st = new StringTokenizer(s);

//         String result = new String();
//         int maxcount = 0;
        
//         while(st.hasMoreTokens()){
//             String a = st.nextToken();
//             if(a.length() >= maxcount){
//                 maxcount = a.length();
//                 result = a;
//             }
//         }

//         System.out.println(result);
//     }
// }


// next ques is remove spaces



public class Problem7 {
    public static void main(String[] args) {
        String s = "My name is harman";

        StringTokenizer st = new StringTokenizer(s);

        StringBuilder result = new StringBuilder();
        
        while(st.hasMoreTokens()){
            result.append(st.nextToken());
        }

        System.out.println(result.toString());
    }
}