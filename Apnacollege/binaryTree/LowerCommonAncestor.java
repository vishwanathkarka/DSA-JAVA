package Apnacollege.binaryTree;

import java.util.ArrayList;
import java.util.*;

public class LowerCommonAncestor {
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
    public static Node head;

    public static boolean getPath(Node root , int n, ArrayList<Node> path){
if(root == null){
    return false;
}
        path.add(root);
if(root.data == n){
    return true;
}
boolean foundLeft = getPath(root.left, n, path);
boolean foundright = getPath(root.right, n,path);
if(foundLeft || foundright){
    return true;
}
path.remove(path.size()-1);
return false;

    }
public static void kNode(Node root, int level, int k){
    if(root == null){
        return;
    }
    if(k == level){
    System.out.println(root.data);
    return;
}
kNode(root.left, level+1, k);
kNode(root.right,level+1,k);


    
}

    public static Node lca(Node root , int n1,int n2){
        // array for finding the path for the target value
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root, n1,path1); // for finding the path
        getPath(root, n2,path2);
int i =0;
        for(; i<path1.size()&&i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        // last equal node 
        Node lca  = path1.get(i-1);
        return lca;




    }
    public static Node lca2(Node root , int n1, int n2){
        if( root == null || root.data == n1|| root.data == n2 ){
return root; // if root is null then return null
        }
        Node leftLCA = lca2(root.left,n1,n2);
        Node rightLCA = lca2(root.right,n1,n2);
        if(rightLCA == null){ // if the element is not found in the right 
            // then we return left 
            return leftLCA;
        }
        if(leftLCA == null){ // same we return right if i don't find in left
            return rightLCA;
        }
        return root; // if we found the both element in the both the left & right
    }


    public static int sumTree(Node root){
        if(root==null){
            return 0;
        }
        int left = sumTree(root.left);
        int right = sumTree(root.right);
        int data = root.data;
        int newleft = root.left==null?0:root.left.data;
         int newright = root.right==null?0:root.right.data;
        root.data = left + right +newleft+newright;
        return data;
    }

    
    public static void main(String[] args) {
        	Node n = new Node(1);
		head = n;
		n.left = new Node(2);
		n.right = new Node(3);
		n.left.left = new Node(4);
		n.left.right = new Node(5);
		n.right.left = new Node(6);
		n.right.right = new Node(7);
		// System.out.println(lca(head,4,5).data);
		// System.out.println(lca2(head,4,5).data);
        System.out.println(sumTree(head));
    }
}
