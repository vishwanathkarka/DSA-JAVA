package Apnacollege.Homework;

// import apple.laf.JRSUIConstants.State;

public class BST {
    static class Tree{
        int data;
        Tree left , right;
public Tree(int data){
    this.data = data;
    this.left  = this.right = null;
}
    }
public static Tree root;


// inserting the value by itrating the tree finding right place to place and placed
public static Tree insert(Tree root, int data){
  if(root == null){
    root = new Tree(data);
  }
  if( data <root.data  ){
   root.left =  insert(root.left, data);
  }
  else if(data> root.data){
  root.right =   insert(root.right, data);
  }
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
static int maxVal = Integer.MIN_VALUE;



// for finding the largest element
public static int largest(Tree root){
if(root == null){
    return 0;
}
  largest(root.right);
  maxVal =  Math.max(maxVal,root.data);
  return maxVal;

}
static int sum  = 0;
public static int RangeSum(Tree root, int start, int end){
    if(root == null){
        return sum;
    }
if(root.data >= start && root.data <= end){
    RangeSum(root.left, start, end);
    RangeSum(root.right, start, end);
 sum =  sum+ root.data;
 return sum;
}
else if(root.data > end){
    RangeSum(root.left, start, end);
}
else if(root.data < start){
    RangeSum(root.right, start, end);
}
return sum;

}

public static void main(String[] args) {
   int values[] = {5,1,3,4,2,7};
   for(int i =0 ; i<values.length;i++){
root = insert(root, values[i]);
   }
// inorder(root);
// int lar = largest(root);
// System.out.println(lar);

int sum = RangeSum(root,4,8);
System.out.println(sum);

}
    
}
