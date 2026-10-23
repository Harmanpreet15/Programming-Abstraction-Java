import java.util.*;

public class LeetCode145 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }
    
    static List<Integer> result = new ArrayList<>();

    public static List<Integer> postorder(Node root) {

        if (root == null) {
            return result;
        }

        postorder(root.left);
        postorder(root.right);
        result.add(root.data);  

        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);


        List<Integer> result = postorder(root);

        System.out.println("Postorder Traversal: " + result);
    }
}