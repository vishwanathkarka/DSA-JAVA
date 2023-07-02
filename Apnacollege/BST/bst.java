package Apnacollege.BST;
import java.util.*;
public class bst {
  static class Node {
Node left;
Node right;
int data;
public Node(int data){
    this.data = data;
}
   }

   public static Node insert(Node root, int val){
    if(root == null){
        root = new Node(val);
        return root;
    }
    if(val<root.data){
        root.left = insert(root.left,val);
    }
    else{
        root.right = insert(root.right,val);
    }
    return root;
   }
   public static void inorder(Node root){
    if(root == null){
        return ;
    }
    inorder(root.left);
System.out.println(root.data+" ");
inorder(root.right);
   }

   public static void printPath(ArrayList<Integer> path){
    for(int i =0; i<path.size();i++){
System.out.print(path.get(i)+" ");
    }
    System.out.println();
   }
   public static void rootToLeafPaths(Node root, ArrayList <Integer> path){

if(root == null){
    return;
}
if(root.left == null || root.right == null){
    printPath(path);
}
    path.add(root.data);
rootToLeafPaths(root.left, path);
rootToLeafPaths(root.right,path);
path.remove(path.size()-1);

   }


   public static void printRange(Node root,int k1,int k2){
// base case;
    if(root == null){
        return;
    }

    if(root.data>=k1 && root.data<= k2){
        printRange(root.left,k1,k2);
        System.out.println(root.data);
        printRange(root.right, k1, k2);  
      }
      else if(root.data>=k1){
        printRange(root.left, k1, k2);
      }
      else{
        printRange(root.right, k1, k2);
      }
   }

   public static Node createMirror (Node root){
    if(root == null){
        return null;
    }
    Node leftSubNode = createMirror(root.left);
    Node rightSubNode = createMirror(root.right);
    root.left = rightSubNode;
    root.right = leftSubNode;
    return root;
    
   }


   public static void main(String[] args) {
    // int values[] = {5,1,3,4,2,7};
//  /5\
// 1\  7
//  /3\
// 2   4
int values[] = {8,5, 3,1,4,10,11,14};
    Node root = null;
for(int i =0; i<values.length;i++){
    root = insert(root,values[i]);
}

// inorder(root);
// printRange(root,5,12);

//5
// 8
// 10
// 11
ArrayList<Integer> path = new ArrayList<>();
rootToLeafPaths(root,path);

   }
}
