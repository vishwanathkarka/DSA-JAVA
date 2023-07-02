package Apnacollege.BST;

public class convertBSTtoBal {
    static class Node {
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
public static Node  root;

public static void main(String[] args) {
    Node root = new Node(8);
   root.left = new Node(6);

}
}
