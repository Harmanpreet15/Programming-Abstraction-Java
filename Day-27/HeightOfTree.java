public class HeightOfTree {

    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
        }
    }

    static int height(Node root){
        if(root == null){
            return -1;
        }

        int leftheight = height(root.left);
        int rightheight = height(root.right);

        return 1 + Math.max(leftheight, rightheight);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        System.out.println(height(root));
    }

}
