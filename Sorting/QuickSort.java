import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
int[] arr = {5,4,6,7,8,3,21};
sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void  sort(int arr[], int low, int high){
        // taking grater value as pivot
if(low>= high){
    return;
}
int s = low;
int e = high;
int m = s+(e-s)/2;
int pivot = arr[m];
// if already sorted then it will not swap
while(s<=e){
    while(arr[s]<pivot){
s++;
    }
    while(arr[e]>pivot){
        e--;
    }
    if(s<=e){
int temp = arr[s];
arr[s] = arr[e];
arr[e] = temp;
s++;
e--;
    }
}
// now my pivot is at correct  index , please sorts two halfs
sort(arr,low,e);
sort(arr,s,high);
    }


}