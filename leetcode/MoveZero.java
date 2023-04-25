import java.util.Arrays;
//https://leetcode.com/problems/move-zeroes/description/
//Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]
public class MoveZero {
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
     }
    static void moveZeroes(int[] nums) {
        int zeros = 0; // intailizing number  of zeros  = 0 at starting

        for(int i =0; i<nums.length;i++){ // for iterating all the values // 0,1,0,3,12 i =0
            if(nums[i] == 0){ // if num  is 0 then increamenting the zero count value true,
                zeros ++; // zero= 1
            }
            else if(zeros>0){ // if number of zeros cout is grater then the 0 then it will move to the loop  // true zeros is 1

                int temp = nums[i]; // saving the nums[i] value in temp
                nums[i] =0; // making nums[i] =0
                nums[i-zeros] = temp; // then it saving the non zero value in the nums[i-1]
                // 0,1,0,3,12 first  i = 0 val = 0
                // making 1,0,0,3,12 still zeros = 1  val 1  1
                // then 1,0,0,3,12 // here nums[i-zeros] = [3-2] so 3 is placed at index 1
                // then 1,3,0,0,12
                // then 1,3,12,0,0
            }
        }
    }
}
