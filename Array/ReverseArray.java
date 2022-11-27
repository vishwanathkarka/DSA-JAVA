public class ReverseArray {
static void  Reverse (int arr[], int n){
    int low = 0;
    int high = n-1;
    while(low<high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        low++;
        high--;
    }
}
    public static void main(String[] args) {
        int arr[] = {10, 5, 7, 30}, n = 4;
        Reverse(arr,n); // [30,7,5,10]
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
