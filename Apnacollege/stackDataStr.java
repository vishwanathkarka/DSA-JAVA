package Apnacollege;
import java.util.*;

import javax.xml.transform.Source;
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
       int arr[] = {6,8,0,1,3};
       int nxtGreater[] = new int[arr.length];

       for(int i =arr.length-1; i>=0;i--){
        while(!s1.isEmpty() && arr[s1.peek()]<= arr[i]){
            s1.pop();
        }
        if(s1.isEmpty()){
            nxtGreater[i] = -1;
        }
        else{
            nxtGreater[i] = arr[s1.peek()];
        }
// storing the index;
        s1.push(i);

    }

    for(int i=0; i<nxtGreater.length;i++){
        System.out.print(nxtGreater[i]+" ");

    }


       
    //     s1.push(2);
    //     s1.push(8);
    //   s1.push(9);
    //   System.out.println(s1);
    //   PushAtBottom(s1);
    //     System.out.println(s1);
        
    }
}
