

public class Shellsort {
    public static void Solution(int arr[],int n) {
for(int gap = n/2; gap>=1; gap/=2 ){
for(int i= gap; i<n; i++){
    int temp = arr[i];
    System.out.println(temp);
}
    System.out.println("--");
}
    }
    public static void main(String[] args) {
        int arr[] = {23,29,15,19,31,7,9};
        System.out.println("Array before sorting");
       Solution(arr,5);
    }
}
