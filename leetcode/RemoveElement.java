// 27. Remove Element
//   https://leetcode.com/problems/remove-element/solutions/ 
// Time complexity:O(n)
// Space complexity:O(1)
class Solution {
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        int index =0; // taking two pointer
        // index is use to find the VAL and replacing with non VAL
        for(int i=0; i<size;i++){
            if(nums[i] !=val){ // 3 != 3 false 2 != 3 true
            //not entering if condition is false so the index value will not increase  But i value will increase
            // so we can replace the values with nums[index] with nums[i]
            int temp = nums[i]; 
            nums[i] = nums[index];
            nums[index] = temp;
            index++;// increasing the index for next swapping
            }
        }
        return index;
    }
    
}

// Input: nums = [3,2,2,3], val = 3
// Output: 2, nums = [2,2,_,_]

// Input: nums = [0,1,2,2,3,0,4,2], val = 2
// Output: 5, nums = [0,1,4,0,3,_,_,_]