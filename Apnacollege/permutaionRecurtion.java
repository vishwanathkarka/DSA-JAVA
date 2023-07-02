package Apnacollege;

public class permutaionRecurtion {
      public static void permutaion (String input, String ans){
        if(input.length()== 0){
            System.out.println(ans+" ");
        }
        for(int i =0; i<input.length();i++){
            char ch = input.charAt(i);
            String lss = input.substring(0,i);
            String rss = input.substring(i+1);
            String pss = lss + rss;
            System.out.println(i+"- "+ch);
            permutaion(pss,ans+ch);
        }
    }
	public static void main(String[] args) {
		String in = "abc";
		permutaion(in,"");
	}
}


// 0- a
// 0- b
// 0- c
// abc 
// 1- c
// 0- b
// acb 
// 1- b
// 0- a
// 0- c
// bac 
// 1- c
// 0- a
// bca 
// 2- c
// 0- a
// 0- b
// cab 
// 1- b
// 0- a
// cba 