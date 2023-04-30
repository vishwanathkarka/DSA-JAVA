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



public static void  maxSum(int numbers[]){

    int postfix[] = new int[numbers.length];
postfix[0]= numbers[0];
    for(int i =1; i<numbers.length;i++){
        postfix[i] = postfix[i-1]+numbers[i];
    }
    int currSum =0;
    int maxVal = Integer.MIN_VALUE;
    for(int i =0; i<numbers.length;i++){
        for(int j =i ; j<numbers.length;j++){
            if(i ==0){
currSum = postfix[0];
            }
            else{
          currSum =  postfix[j]-postfix[i-1];
            }
        }
        if(maxVal < currSum){
            maxVal = currSum;
        }
    }
    System.out.println(maxVal);
}

public static void maxSum3(int numbers[]){
    int maxSum = Integer.MIN_VALUE;
    int currSum =0;
    for(int i =0; i<numbers.length;i++){
        currSum = currSum + numbers[i];
        if(currSum <0){
            currSum =0;
        }
        maxSum = Math.max(currSum,maxSum);
    }
    System.out.println(maxSum);

}

public static Boolean findNumber(int numbers[]){

for(int i =0; i<numbers.length;i++){
    for(int j =i+1;j<numbers.length;j++){
if(numbers[i]== numbers[j]){
    return true;
}
    }
}
return false;

}

public static int findIndexValue(int numbers[],int target){
    for(int i =0; i<numbers.length;i++){
        if(numbers[i]== target){
            return i;
        }
    }
    return -1;
}
public static int stockSellAndBuy(int numbers[]){
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for(int i =0; i<numbers.length;i++){
if(minPrice>numbers[i]){
    minPrice = numbers[i];
}
else{
    int profit =  numbers[i]-minPrice;
    maxProfit = Math.max(maxProfit,profit);
}

    }
    return maxProfit;
}

public static int trappedRainWater(int height[]){
    int totalWaterTrapped = 0;
    int n = height.length;
    int leftMax[] = new int[n];
    int rightMax[] = new int[n];
    leftMax[0] = height[0];
    for(int i =1; i<n;i++){
    leftMax[i] = Math.max(leftMax[i-1], height[i]);
    }
rightMax[n-1] = height[n-1];
    for(int i =n-2; i>=0;i--){
    rightMax[i] = Math.max(rightMax[i+1], height[i]);
    }
    for(int i =0;i<n;i++){
int waterLevel = Math.min(leftMax[i],rightMax[i]);
totalWaterTrapped += waterLevel-height[i];

    }
    return totalWaterTrapped;
}
    public static void main(String args[]){
    int arr[] = {7,1,5,3,6,4};
    int arr1[] = {0,1,0,2,1,0,1,3,2,1,2,1};
    // pairArray(arr);
   System.out.println( trappedRainWater(arr1));
    }
}
