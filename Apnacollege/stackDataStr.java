package Apnacollege;
import java.util.*;
public class stackDataStr {
    
public static void PushAtBottom(Stack<Integer> s){
    if(s.isEmpty()){
        s.push(56);
        return;
    }
    int a =  s.pop();
    PushAtBottom(s);
    s.push(a);
}

    public static void main(String[] args) {
        Stack <Integer> s1 = new Stack<>();
        s1.push(2);
        s1.push(8);
      s1.push(9);
      System.out.println(s1);
      PushAtBottom(s1);
        System.out.println(s1);
        
    }
}
