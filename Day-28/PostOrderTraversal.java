public class PostOrderTraversal {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
        }
    }

    public static void PostOrder(Node root){
        if(root == null){
            return ;
        }

        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        PostOrder(root);
    }
}
