import java.util.Arrays;


public class HeapSort {
    public static void main(String[] args) {

    }


   static void Insertion (int a[], int n,int value){
        n = n+1; // increasing the size of array
        a[n]= value;
        int i = n; // we are taking tmp value because don't wanted to update n value
        while(a[i]>1){ // ex i =6  6>1 after itertion i/2  that is i = 3
            double parent = Math.floor(i/2);
           int temp = a[i];
           a[i] = a[(int)parent];
           a[(int)parent] = temp;
        }

    }


    static void Delection(int a[], int n) {
        // deleting the first element
        a[1] = a[n]; // replacing the target value with the last value in the array
        n = n-1; // deleting the last element by reducing size of array
        int i =1;
        while(i<n){ // in iteration i value will increase so we check value should be less than size of array
            int left  = a[2*i]; // for the left value from the root
            int right = a[2*i+1]; // for the right value
            int larger = left>right?2*i:2*i+1; // finding the largest
            if(a[i]<a[larger]){ // while i less than larg then swap is done
                int temp  = a[i];
                a[i] = a[larger];
                a[larger] = temp;
                i = larger; // where root value is correct place now we need to check child root value
            }
        }

    }
}





