package Apnacollege.backtrack;

public class Permutations {
    public static void permutations(String str, int k, String ans){
        if(str.length()==0){
            // System.out.println(ans);
            return ;
        }
        for(int i =0; i<str.length();i++){ //0 
        char curr = str.charAt(i); // a 
        System.out.println("**"+str+"-"+ans);
        String newStr = str.substring(0,i)+str.substring(i+1); // bc
        permutations(newStr, k, ans+curr); 
        }
    }
    public static void main(String[] args) {
        String str  = "abc";
        permutations(str, 0, "");
    }
}
