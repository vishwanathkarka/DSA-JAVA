package Apnacollege.binaryTree;

import java.util.*;

public class LevelOrder {
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
    // public class treeConstructor{
    //     public static void treeCon(data){
    //         Node n = new Node(data)
    //         if(head==null){
    //             head = n;
    //         }
            
    //     }
    // }
	
	public static void main(String[] args) {
	    
		Node n = new Node(1);
		head = n;
		n.left = new Node(2);
		n.right = new Node(3);
		n.left.left = new Node(4);
		n.left.right = new Node(5);
		n.right.left = new Node(6);
		n.right.right = new Node(7);
		Queue <Node> q = new LinkedList <>();
		q.add(head);
		q.add(null);
		while(!q.isEmpty()){
		    Node currval = q.remove();
		    if(currval == null){
		        System.out.println();
		        if(q.isEmpty()){
		            break;
		        }
		        else{
		            q.add(null);
		        }
		    }
		    else{
		        System.out.print(currval.data);
		        if(currval.left !=null ){
		            q.add(currval.left);
		        }
		        if(currval.right != null){
		            q.add(currval.right);
		        }
		    }
		}
	}
}
