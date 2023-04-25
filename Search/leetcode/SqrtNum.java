package leetcode;

public class SqrtNum {
    public static void main(String[] args) {
        System.out.println( mySqrt(8));
    }
   static int mySqrt(int x) {
        long low = 1;
        long high = x;
        long mid  = (high+low)/2;
//       long mid = low + (high-low)/2;

        while(low<=high){

            if(mid*mid==x){
                break;
            }
            else if(mid*mid>x){

                high = mid-1;
            }
            else{
                low = mid+1;
            }
            mid = (high+low)/2;
//            mid = low + (high-low)/2;
        }
        return(int)mid;
    }
}
