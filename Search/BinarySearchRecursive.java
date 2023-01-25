public class BinarySearchRecursive {
    static int bSearch(int arr[], int target, int low, int high ) {


            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
               return bSearch(arr,target,mid+1,high);
            } else {
                return bSearch(arr,target,low,mid-1);
            }


    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 8;
        System.out.println( bSearch(arr,target,0,arr.length));
    }
}
