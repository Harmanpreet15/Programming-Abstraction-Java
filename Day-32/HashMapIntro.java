import java.util.*;

public class HashMapIntro{
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Divyansh Khurana");
        map.put(103, "Vishesh");
        map.put(102, "Nishchay");
        map.put(100, "Nishchay");
        map.put(10, "Aakash");
        map.put(1, "Nishchay");
        map.put(0, "Nishchay");
        map.put(2, "Nishchay");
        map.put(200, "Nishchay");

        System.out.println(map);
    }
}

// it depends on key hashcode value
// hashcode() - there is one hashcode function which is inbuild whose work is to calculate hashcode value
// us hashing ke through bucket index calculate krta he
// fir store krta jata he
// FORMULA : index = (n-1) &hash
// n = hashmap ki capacity (default capacity is 16)


// key    hash   bucket index
//  0      0          0
//  1      1          1 
//  2      2          2
// 10      10         10
// 100     100        4
// 101     101        5