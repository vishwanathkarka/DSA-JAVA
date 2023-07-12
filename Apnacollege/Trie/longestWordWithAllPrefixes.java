package Apnacollege.Trie;

public class longestWordWithAllPrefixes {
    static class Node{
        Node children[]= new Node[26]; // creating the arr with the size  of A-Z 
        boolean eow;
     public  Node(){
        for(int i = 0; i<children.length;i++){ // inserting the values in the array as the null
            children[i] = null;   
        }
     }
    }

    public static Node root = new Node();
    public static void insert(String word){
        int level = 0;
        int len = word.length();
        int idx = 0;
        Node curr = root; // we are taking temp variable to store the root ref becasue if we change the root then it automatically updated
        for(; level<len;level++){ // this loop for the inserting the all the values in tha array;
            idx = word.charAt(level)-'a';
            if(curr.children[idx]== null){ // array is in the class
curr.children[idx] = new Node(); // we don't store any values here we just create an object to it
            }
curr = curr.children[idx];
        }
        curr.eow = true;
    }


    public static boolean search(String key){
        int level =0;
        int len = key.length();
        Node curr = root;
        for(;level<len;level++){
            int idx = key.charAt(level)-'a'; // we find the index by subtracting the char with a
            if(curr.children[idx]== null){
                return false;
            }
 curr = curr.children[idx];
        }
        if(curr.eow == true){
            return true;
        }
         return false;
    }



   public static String ans = "";
   public static void longestWord(Node root, StringBuilder temp){
    if(root == null){
        return;
    }
    for(int i =0; i<26; i++){

        // case -1
        if(root.children[i]!= null && root.eow== true){
            char ch = (char) (i+'a');
            temp.append(ch);
            if(temp.length()> ans.length()){
ans = temp.toString();
            }
            longestWord(root.children[i], temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
   }
   public static void main(String[] args) {
    String words[]={"a","banana","app","appl","ap","apply","apple"};
    for(int i =0; i<words.length;i++){
        insert(words[i]);
    }
    longestWord(root, new StringBuilder(""));
    System.out.println(ans);
   }
}

