public class MergeSort4LomutoPartition {
// placing p value in the mid and sorted
    static void Partition (int[] arr, int l , int h,int p){  // for this code we are taking the last element to be the p
       int i =  l-1;
       for(int k =0; k<h; k++){ //swap low value to sort
           if(arr[k]<arr[p]){
               i++;
               int temp = arr[i];
               arr[i] = arr[k];
               arr[k] = temp;
           }

       }
       int temp = arr[i]; // this is for swaping of the k value at correct postion
       arr[i] = arr[p];
       arr[p] = temp;

    }
    public static void main(String[] args) {
        int arr[] = new int[]{10,80,30,90,40,50,70};

Partition(arr,0,arr.length-1,arr.length-1);
for(int j : arr){
    System.out.println(j);
}
    }
}
