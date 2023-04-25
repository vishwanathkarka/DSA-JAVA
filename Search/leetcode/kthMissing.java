package leetcode;

public class kthMissing {
    public static void main(String[] args) {
        int arr[] = new int[] {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));
    }
   static public int findKthPositive(int[] arr, int k) {
        int lo =0;
        int hi = arr.length;
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            int missing = arr[mid] - (mid+1);
            if(missing<k) lo = mid+1;
            else hi = mid;
        }
        return lo+k;
    }
}
