package Apnacollege;

public class sort {
    public static void bubbleSort(int arr[]){
        int n = arr.length;
for(int i=0; i<n; i++){
    for(int j =0; j<n-i-1;j++){
if(arr[j]>arr[j+1]){
int temp = arr[j];
arr[j] = arr[j+1];
arr[j+1] = temp;
}
    }
}
    }
public static void selectionSort(int arr[]){

    for(int i =0; i<arr.length;i++){
        int min = i;
        for(int j =i;j<arr.length-1; j++){
            if(arr[j]<arr[min]){
               min = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
}
 
public static void insertionSort(int arr[]){
    int n = arr.length;
  for(int i =1; i<n;i++){
    int prev = i-1;
    int curr = arr[i];
    //finding the correct pos
    while(prev >=0 && arr[prev] > curr){
arr[prev+1] = arr[prev];
prev--;
    }
    //insertion
   arr[prev+1] =  curr;
  }  
}

public static void countSort(int arr[]){
    int maxVal = Integer.MIN_VALUE;
    for(int i =0; i<arr.length;i++){
    //   if(arr[i]> maxVal){
    //     maxVal = arr[i];
    //   }  
    maxVal = Math.max(arr[i],maxVal);
    }
    int count [] = new int[maxVal+1]; // if not take maxVal+1 then i need to add the  i<=arr.length
    for(int i =0; i<arr.length;i++ ){
       count[arr[i]]++;
    }
    //sorting 
    int j =0;
     // this is for point to the array size 
        // in some case the count[1] => 2 then i need to add arr[n] and arr[n+1]
        // so we use j which will be increment when while loop is true 
    for(int i=0;i<count.length;i++){
        
        while(count[i]>0){
            arr[j] = i; // assigning the index value of count in the arr
            j++;
            count[i]--;
        }
    }
}
public static void main (String[] args) {
int arr [] = {3,2,1,6,7,9,10};
// bubbleSort(arr);
// selectionSort(arr);
// insertionSort(arr);
countSort(arr);
for(int val :arr){
    System.out.print(val+" ");
}
    }
}
