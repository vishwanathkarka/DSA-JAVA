package Apnacollege.Homework;

public class binaryTree {
    static class Tree{
        int data;
        Tree left , right; 
        Tree(int data){
            this.data = data;
            this.left = this.right = null;
        }

    }
    public static Tree root ;

    public static Tree createMirror(Tree root){
        if(root == null){
            return null;
        }
     Tree leftSubTree = createMirror(root.left);
     Tree rightSubNode  = createMirror(root.right);
     root.left = rightSubNode;
     root.right =  leftSubTree;
     return root;
    }
// inorder print
public static void inorder(Tree root){
    if(root == null){
        return;
    }
inorder(root.left);
System.out.println(root.data);
inorder(root.right);
}

    public static void main(String[] args) {
        Tree t1 = new Tree(4);
        root = t1;
        t1.left = new Tree(5);
        t1.right = new Tree(7);
        t1.left.left = new Tree(89);
        t1.right.right = new Tree(78);
        t1.right.right.left = new Tree(1);
        t1.right.right.right = new Tree(34);
        inorder(t1);
        createMirror(t1);
        System.out.println("_________");
        inorder(t1);
    }


}
