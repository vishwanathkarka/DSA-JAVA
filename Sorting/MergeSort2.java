public class MergeSort2 {
    // low to mid sorted & mid+1 to high are sorted we needed to sort the hole array
    static void Msort(int arr[],int l, int m, int h){
        int n1 = m-l+1;
        int n2 = h-m;
        int left[] = new int[n1];
        int right[] = new int[n2];
       for(int i=0; i<n1; i++){
            left[i] = arr[i]; // storing in the left arr
       }
       for(int j=0; j<n2;j++){
           right[j] = arr[m+1+j];  // storing in the right arr
       }
       int i=0, j =0, k=0;  // we are using k to reassign value to arr
       while(i<n1&& j<n2){
           if(arr[i]<arr[j]){
               arr[k++]= left[i++]; // Here replacing value arr with left
           }
           else{
             arr[k++]= right[j++]; // with right value
           }
       }
       while(k<n1){
           arr[k++] = left[i++];
       }
       while(k<n2){
           arr[k++] = right[j++];
       }
    }
    public static void main(String[] args) {
        int a[] = new int[]{10,15,20,40,8,11,15,22,25};
        int l=0,h=8,m=3;

        Msort(a,l,m,h);
        for(int x: a)
            System.out.print(x+" ");
    }
}
