public class Mergesort1 {
// The numbers are in the sorted order
    static void MergeSort(int arr1[],int arr2[]){
int i=0,j=0;
int n[] = new int[arr1.length+arr2.length];
while(i<arr1.length&& i<arr1.length){ // case is 0( N+1)
    if(arr1[i]<arr2[j]){
        System.out.println(arr1[i]);
        i++;
    }
    else{
        System.out.println(arr2[j]);
        j++;

    }
}
while(i< arr1.length){  // the thing which been left are printed
    System.out.println(arr1[i]);
}
while(j<arr2.length){
    System.out.println(arr2[j]);
}

    }
    public static void main(String[] args) {
        int a[] = new int[]{10,15,20,40};
        int b[] = new int[]{5,6,6,10,15};
        MergeSort(a,b);

    }
}
