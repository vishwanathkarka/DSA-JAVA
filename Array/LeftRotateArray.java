public class LeftRotateArray {
    static void leftRotation(int arr[], int n, int d){// d =3
        reverse(arr,0,d-1); // [3,2,1]
        reverse(arr,d,n-1); // [9 8 7 6 5 4 ]
        reverse(arr,0,n-1);// [4 5 6 7 8 9 1 2 3 ]
    }
//[]
    static void reverse(int arr[], int low,int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
//    Method -2

static void leftRotate(int arr[], int d, int n)
{
    int temp[] = new int[d];

    for(int i = 0; i  < d; i++)
    {
        temp[i] = arr[i];
    }

    for(int i = d; i  < n; i++)
    {
        arr[i - d] = arr[i];
    }

    for(int i = 0; i  < d; i++)
    {
        arr[n - d + i] = temp[i];
    }

}
    // Method-3
    static void lRotateOne(int arr[], int n)
    {
        int temp = arr[0];

        for(int i = 1; i < n; i++) // shift one element to last [2,3,4,5,6,7,8,9,1]
        {                         // Second  call [3,4,5,6,7,8,9,1,2]
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = temp;
    }

    static void leftRotate1(int arr[], int d, int n)
    {
        for(int i = 0; i < d; i++)
        {
            lRotateOne(arr, n);
        }
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        leftRotation(arr,9,3);
        for(int i =0; i<9; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
