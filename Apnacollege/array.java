package Apnacollege;

public class array {
public static void LinerSearch(int arr[],int target){
    for(int i =0; i<arr.length;i++){
        if(arr[i] == target ){

        }
    }
}
public static void pairArray(int arr[]){
    for(int i=0; i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            System.out.print("("+arr[i]+","+arr[j]+")");
        }
        System.out.println();
    }
}
// (1,2)(1,3)(1,4)(1,5)(1,6)(1,7)
// (2,3)(2,4)(2,5)(2,6)(2,7)
// (3,4)(3,5)(3,6)(3,7)
// (4,5)(4,6)(4,7)
// (5,6)(5,7)
// (6,7)
public static void subArray(int arr[]){
    for(int i =0; i<arr.length;i++){ // this is for starting number
        for(int j =i;j<arr.length;j++){ /// this is for ending number
            for(int k =i; k<=j; k++){ // this is for printing form start to end
System.out.print(arr[k]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
// 1
// 12
// 123
// 1234
// 12345
// 123456
// 1234567

// 2
// 23
// 234
// 2345
// 23456
// 234567

// 3
// 34
// 345
// 3456
// 34567

// 4
// 45
// 456
// 4567

// 5
// 56
// 567

// 6
// 67

// 7

public static void  maxSubArray(int numbers[]){
   
    int maxSum = Integer.MIN_VALUE;
    for(int i =0; i<numbers.length;i++){
        int currSum = 0;
        for(int j =i;j<numbers.length;j++){
            for(int k =i;k<=j;k++){
                currSum += numbers[k];
            }


            if(maxSum< currSum){
               maxSum = currSum; 
            }
        }

    }
    System.out.println(maxSum);
}
    public static void main(String args[]){
    int arr[] = {1,2,3,4,5,6,7};
    // pairArray(arr);
    maxSubArray(arr);
    }
}
