package Apnacollege.Trees;

public class DisJointSet {
    static int n = 7;
    static int  par[] = new int[n];
    static int  rank[] = new int[n];

    public static void init(){
        for(int i =0; i<n; i++){
            par[i] = i;


        }
    }

    public static int find(int x){
        if(x == par[x]){
            return x;
        }
        return find(par[x]);  
    }

    public static void union(int a, int b){
        int parA = find(a); // find the parent of a then stored in the parA varable
        int 
    }

    public static void main(i)
}
