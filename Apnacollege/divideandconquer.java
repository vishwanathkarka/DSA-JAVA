package Apnacollege;

public class divideandconquer {
    public static void mergeSort(int arr[],int start , int end ){
if(start>= end){
    return;
}
int mid = start +(end-start)/2;  // find mid
mergeSort(arr, start, mid); // left part  
// this function will call untill the it true the base case then only next function will be execute
// Start ->0--end=>9
// Start ->0--end=>4
// Start ->0--end=>2
// Start ->0--end=>1
// Start -> 0-- end=> 0 base case then true
// left :Start ->8--end=>9 left part in right part right:Start ->5--end=>9

mergeSort(arr, mid+1, end); // right part
//right: Start ->3--end=>4 left part in the left: Start ->0--end=>2
//right: Start ->5--end=>9 left part of left: Start ->0--end=>9
// Start ->5--end=>7
// Start ->5--end=>6

// for merging the array
// this will execute after all the values are smaller vlaues
merge(arr,start, mid ,end);
    }
    public static void merge(int arr[], int start, int mid, int end){
int temp[] = new int[end-start+1]; // start+1 because to include the start value also
// this temp array is used to store the data
int i = start;  //index for 1's sorted part
int j = mid+1; //idx for 2nd sorted part
int k =0; // index of the k 
// we use the two pointer that is arr & temp
System.out.println("start -> " +start+"mid->"+mid);
while(i<=mid && j<=end){ // both condition should be true

    if(arr[i]<arr[j]){
        temp[k] = arr[i];
        i++;
        k++;
    }
    else{
        temp[k] = arr[j];
        j++;
        k++;
    }
}

while(i<=mid){
    temp[k++] = arr[i++];
}
while(j<=end){
    temp[k++] = arr[j++];
}
//copy temp to original array
for(k=0, i=start; k<temp.length; k++, i++) {
    arr[i] = temp[k];
}
    }
    public static void printArray(int arr[]){
for(int i =0; i<arr.length;i++){
    System.out.print(arr[i]);

}
System.out.println();
    }


    
    public static void main(String[] args) {
      int arr[] = {2,11,22,4,5,67,8,9,0,23};
      mergeSort(arr,0,arr.length-1);

printArray(arr);
     }
    
}
