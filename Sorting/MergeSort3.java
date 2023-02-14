import java.sql.Array;

public class MergeSort3 { // not been executed
    //finding the middle element among the array
   static void Partion ( int[] arr ,int l,int h,int p){ // if p = 5 then 5 should be placed at middle [3,1,2, 5 ,7,8,9]
       // all the number before and after p value may or may not be sorted by left values should less than p value
       //
int[] temp = new int[h-l+1]; // this is for storing arr value to sort and update the arr val
       int index =0;
       for(int i =0; i<=h; i++) {
           if (arr[i] <= arr[p] && i!= p) {
               temp[index] = arr[i]; // we are using index variable to access temp arr index
               index++;

           }
           temp[index++] = arr[p];
       }
       for(int i=0; i<=h; i++) {
           if (arr[i] > arr[p]) {
               temp[index] = arr[i];
               index++;
           }
       }
       for(int i=1; i<=h ;i++){
           arr[i-1] = temp[i-1]; //replacing the vales of arr with temp values
           System.out.println(temp[i]);
   }


    }
    public static void main(String[] args) {
int arr[] = {5,13,6,9,12,11,8};
int l= 0;
int h = arr.length-1;
int p = arr.length-1;
        Partion(arr,l,h,p);
   for(int j:arr){
       System.out.print(j+" ");
   }
    }
}
