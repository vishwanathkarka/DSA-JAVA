public class Selection {
static void Ssort(int arr[] , int n){
// bubble sort is slower than the selection sort as a greater number of comparisons is required.
    // selection sort  is faster than the bubble sort as a lesser number of comparisons is required.
  for(int i =0;i<n;i++){
      int min= i; // we check the min element in Sel sort, where in the bubble sort we check greater element
      for(int j =i+1; j<n; j++){  // length = 3 compartion will be only 2  already // we took the i value in min so no need of one more iteration
          // if we give the j = i noting will happen one more swapping will happen
          // after every iteration first values will be sorted
if(arr[j] <arr[min]){ // for every j itration only one swap is heppening
    min = j;
}
      }
      int temp = arr[i];
       arr[i] = arr[min];
       arr[min] = temp;


  }
}
    public static void main(String[] args) {
        int arr[] = {11,22,13,25,10,40};
        int n = 6;
        Ssort(arr,n);
        for(int i =0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
