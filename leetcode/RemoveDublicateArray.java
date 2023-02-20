// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class RemoveDublicateArray { // Here numbers is in sorted order
    public int removeDuplicates(int[] nums) {
        if(nums.length ==0){ // checking the size of array if size = 0 skiping
            return 0;
        }
        int addIndex =1; 
        for(int i =0; i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){ // ex 2<2 condition false 2<3 true by this duplication is removed
nums[addIndex] = nums[i+1]; //How ever the first value is unique
// replacing the duplicate value with unique by saving the non unique values
addIndex = addIndex+1; // increasing the index of replacing the next value with unique
            }
        }
        return addIndex; // returning the last unique value by sending the index of it
        // OR we can print the unique value by for loop 
    }
}

// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]
