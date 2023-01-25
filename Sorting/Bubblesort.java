public class Bubblesort {
    static void Bsort( int arr[], int n){
        for(int i =0; i<n-1; i++){ // we take n-1 because we need not to swap the last because it swap
            for(int j=0; j<n-i-1;j++ ) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+ 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    // optimized code
    static void BOptimized(int arr[], int n){
       Boolean issorted = false;
        for(int i =0; i<n-1; i++){
            for(int j=0; j<n-i-1;j++ ) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+ 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    issorted = true;
                }
                if(issorted== false){ // if sorted it need not to check all the values again
                    break;
                }

            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {11,22,13,25,10,40};
        int n = 6;
        Bsort(arr,n);
        for(int i =0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
