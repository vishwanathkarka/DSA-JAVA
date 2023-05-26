package Apnacollege.backtrack;

public class backtrack {
    public static void subset(String str,String newStr,int i){
        if(i == str.length()){
            System.out.println(newStr);
            return;
        } 

        // yes choice
        subset(str, newStr+str.charAt(i), i+1);
        // no choice
        subset(str, newStr, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        subset(str,"",0);
    }
}
