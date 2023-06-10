package Apnacollege;

import java.net.SocketTimeoutException;

public class recurssion {
     static void  print (int n){

if(n == 1){
    return ;
}
// System.out.println(n);
//10
// 9
// 8
// 7
// 6
// 5
// 4
// 3
// 2
 print(n-1);
 System.out.println(n);
//  2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
    }

    static int fib(int n){
        if(n== 1 || n==0){
return 1;
        }
      return  n+fib(n-2);
    //   8%  
    }
    
    static int fact (int n){
        if(n == 1){
            return 1;
        }
    //   return n* fact(n-1);
    int f = fact(n-1);
    return n*f;
    }
    
    static int sumNaturalNo(int n){
        if(n==1){
            return 1;
        }
    
     int k  = sumNaturalNo(n-1);
  int sn =   k+n;
  return sn;
    // return  n+ sumNaturalNo(n-1); 
    }

    static Boolean isSortedArray(int[] arr, int k){
      if(arr[k]>arr[k+1]){
return false;
      }
      if(k == arr.length-2){
        return true;
      }
        
      return  isSortedArray(arr,k+1);
       
      
    }
  
    static int firstOcc(int[] arr,int k,int tar){
    if(k == arr.length-1){
        return -1;
    }
  

  if(arr[k] == tar)
    return k;
return firstOcc(arr,k+1,tar);
  
  }
  
  static int lastOcc(int[] arr,int k ,int tar){
 if(k == arr.length){
    return -1;
 }
 int res = lastOcc(arr, k+1,tar); //res will return the values
 System.out.println(res);
 System.out.println(k);
 if(res == -1 && arr[k] == tar){
    return k;
 }
 return res;
  }

  static int power(int x , int n){
if(n== 0){
    return 1;
}
// int val = power(x,n-1);
// int pow = val *n;
// return pow;
return n* power(x,n-1);
  }

  // given 2*n space to place tailes , we need to find different ways to to place the tailes
  // as the row are same 2 colums will change
  static int tailing(int n){
if(n == 0 || n == 1){
  return 1;
}
// vertical choice => |
int fvno = tailing(n-1);

// Horizontal choice +> -
int fhno = tailing(n-2);

int toWays = fvno+fhno;
return toWays;

  }

  public static void removeDuplicate(String str, int indx, StringBuilder newStr, boolean[] map ){
    if(indx == str.length()){
      System.out.println(newStr);
      return;
    }
    char currChar = str.charAt(indx);
    if(map[currChar-'a']==true){  // if b-a => 1 map[false,true,false,....]
      //  if a - a=> 0 so we check the value int the map array boolen 
      //if it contain true then it mean it is already contains
      removeDuplicate(str, indx+1, newStr, map); // value is already existed in the newStr so we are moving to the next index 

    }
    else{ // it mean it is not in the newStr
      map[currChar-'a'] =true; // adding the the value true
      newStr.append(currChar);
      removeDuplicate(str, indx+1, newStr, map);
    }
  }


  public static int friendpairing(int n){
    if(n ==1 || n==2){
      return n;
    }
    return friendpairing(n-1) + (n-1)*friendpairing(n-2); // fri(n-1) => single pair
    //n * fri(n-2) // double pair 

  }

  public static void printDec(int n){
    if(n==1){

      System.out.println(n);
      return;
    }
   
    printDec(n-1);
    System.out.println(n);
  }



  public static void main(String[] args) {
    //   print(10);
    System.out.print(fib(5));
// System.out.print(fact(5));
// 120

// System.out.println(sumNaturalNo(5));
// 15
int arr[]= {1,33,33,33,55};
// System.out.println(isSortedArray(arr,0));
// System.out.println(power(2,10));
// System.out.println(tailing(5));
String str = "helloeveryone";
removeDuplicate(str, 0,new StringBuilder(""),new boolean[26]); // letters in alpabets are 26
//helovryn
// printDec(5);
}
}
