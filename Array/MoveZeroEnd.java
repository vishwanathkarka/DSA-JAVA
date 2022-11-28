public class MoveZeroEnd {
    static void MoveZero(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < n; j++) { // replacing 0 with non 0 element
                    if (arr[j] != 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }
static void Move(int arr[], int n){
        int count =0;
        for(int i=0; i<n;i++){ // swaping if number is not zero swaping it with itself if  zero swaping  with zero
            if(arr[i]!=0){ // condition for swapping
                int temp = arr[i];
                arr[i]= arr[count];
                arr[count] = temp;
                count++;
            }
        }
}
    public static void main(String[] args) {
        int arr[] = {10, 20, 0, 0, 30, 40, 0, 60};
        int n = 8;
//        MoveZero(arr, n);// 10 20 60 40 30 0 0 0
        Move(arr,n);
        for (int ar : arr) {
            System.out.print(ar+" ");
        }
    }
}
