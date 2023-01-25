public class InsertionSort {
static void Isort(int arr[],int n){

    for(int i =1; i<n; i++){
        int key = i;
        int j = i-1;
        while(j>=0  && arr[j] >key){
            arr[j+1] = arr[j] ;
            j--;
        }
        arr[j+1] = key;
    }
}

    public static void main(String[] args) {
        int arr[] = {11,22,13,25,10,40};
        int n = 6;
        Isort(arr,n);
        for(int i =0; i<n; i++){
            System.out.println(arr[i]);
        }

    }
}
