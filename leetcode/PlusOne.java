import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
int arr [] = {4,3,2,1};
    int[] aa =    plusOne(arr);
        System.out.println(Arrays.toString(aa));
    }
    static int[] plusOne(int[] digits) {
        for(int val = digits.length-1; val>=0;val--){ // moving form the last value
            if(digits[val]<9){ //last is not 9 then
                digits[val]++; // last value is incremented +1
                return digits; // returning the arr because i successfully add 1 at end
            }
            digits[val] = 0; // if last value is 9 then last value is replaced by 0  // ex 1,2,9 last value is 9 then replaced with 0 => 1,2,0
            // then it will move to the next iteration it moves to the if stmt where value is less then the 9
            // after that value will be incremented by 1 where 120
        }
//        we will be here when the value is 999 or 99 or 9 if not it will be returned at the if stmt
        digits = new int[digits.length+1]; // if the value is 9 then i needed to add 1 at front => 10
        // size is restricted so we making new array
        digits[0] =1; // making arr[0] = 1 => {1,0}
        return digits; //returning the value
    }
}
