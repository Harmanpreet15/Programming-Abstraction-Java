import java.util.*;

public class LeetCode118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> x = new ArrayList<>();
        for(int i = 0;i<numRows;i++){
            List<Integer> p = new ArrayList<>();
            p.add(1);
            for(int j = 1;j<i;j++){
                p.add(x.get(i-1).get(j-1) + x.get(i-1).get(j));
            }
            if(i>0){
                p.add(1);
            }
            x.add(p);
        }

        return x;
    }

    public static void main(String[] args){
        LeetCode118 obj = new LeetCode118();
        int numRows = 5;
        System.out.println(obj.generate(numRows));
    }
}