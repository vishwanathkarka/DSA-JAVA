package Apnacollege.backtrack;

public class Findpermutation {

    public static void findpermutation(String str, String ans){
        // base case
if(str.length()==0){
    System.out.println(ans);
    return;
}
// for getting all the cobbination for 
for(int i =0; i<str.length();i++){ // number of combinations are n!
    char curr = str.charAt(i);  // secting the current value
  String newStr = str.substring(0,i)+str.substring(i+1); // to remove the curr value form the string
  // merging the two substrings
    findpermutation(newStr,ans+curr);
}
    }
    public static void main(String[] args) {
        String str = "abc";
        findpermutation(str,"");
// abc
// acb
// bac
// bca
// cab
// cba

    }
}
