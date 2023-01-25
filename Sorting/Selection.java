public class Selection {
static void Ssort(int arr[] , int n){

  for(int i =0;i<n;i++){
      int min= i;
      for(int j =i+1; j<n; j++){
if(arr[j] <arr[min]){
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
