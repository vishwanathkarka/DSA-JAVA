package Apnacollege;

public class qsort {
    public static void  quicksort(int arr[], int start,int end){

        if(start >= end) { // base case
            return;
        }

int pi = pivot(arr, start,end);
quicksort(arr, start, pi-1);// already pivote is sorted
quicksort(arr, pi+1,end);
    }
    public static int pivot(int arr[],int start, int end){
int pi = arr[end]; 
int j = start-1;  // if we take j = start counting will be error so we place j = start-1 
// if start = 0 then j = -1
// makes space for elements smaller than pivot
// counting the number of element less than the pivote
// and placing the value pivote after for loop
        for(int i=start; i<end;i++){
            if(arr[i]<pi){
                j++; // counts the number value less than pivote
             int temp = arr[i]; 
             arr[i] = arr[j]; // initially arr[j] = null 
             arr[j] = temp; // here we are swapping value such that value left side of pivote will be less then right side will be greater than
             // if we swap the less than value then automatically right side values will swaps
            }
        }
        // placing the pivote at correct place
        j++;
        int temp  = arr[j];
        arr[j] = pi;
        arr[end] = temp; // val
        return j;
    }

    public static void printArray(int arr[]){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        
        }
        System.out.println();
            }
        
    public static void main(String[] args) {
        int arr[] = {2,11,22,4,5,67,8,9,0,23};
        quicksort(arr, 0, arr.length-1);
printArray(arr);
    }
}
