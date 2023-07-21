package Apnacollege.Dp;

public class fibonacci {
    
    public static int fib(int n , int f[]){
if(n ==0 || n == 1){
    return n;
}
if(f[n]!= 0){
    return f[n];
}
return fib(n-1,f)+ fib(n-2,f);
    }

    public static void main(String[] args) {
        int f[] = new int[6+1];
        System.out.println(fib(6,f));
    }
}
