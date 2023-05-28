package Apnacollege.backtrack;

public class gridways {
    public static int GridWays(int i, int j, int n, int m){
        //basecase
        if(i == n-1 && j == m-1){ //corners 
            return 1;
        }
        else if(i==n || j ==m){ // boundary
            return 0;
        }
        int g1 = GridWays(i+1, j, n, m);
        int g2 = GridWays(i, j+1, n, m);
        return g1+g2;
    }
    public static void main(String[] args) {
        int n =3, m = 3;
        System.out.println(GridWays(0, 0, n, m));

    }
}
