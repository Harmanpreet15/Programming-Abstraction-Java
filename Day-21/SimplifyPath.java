import java.util.*;

public class SimplifyPath {
    public static String simpath(String path){
        Stack<String> stack = new Stack<>();

        String[] parts = path.split("/");

        for(String p : parts){
            if(p.equals("") || p.equals(".")){
                continue;
            }else if(p.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(p);
            }
        }

        StringBuilder res = new StringBuilder();
        
        for(String s : stack){
            res.append("/");
            res.append(s);
        }

        if(res.length() == 0){
            return "/";
        }

        return res.toString();
    }
    public static void main(String[] args) {
        String path = "/home/user/Documents/../Pictures";
        System.out.println(simpath(path));
    }
}
