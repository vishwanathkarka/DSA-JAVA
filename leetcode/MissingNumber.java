public class MissingNumber {
//    https://leetcode.com/problems/missing-number/description/
//    Input: nums = [3,0,1]
//    Output: 2
    public static void main(String[] args) {
        int nums[] = {3,0,1};
int res = findMissing((nums));
        System.out.println(res);
    }
    static int findMissing(int[] nums){
        int res = nums.length; // 3
        for(int i =0; i<nums.length; i++){
            res += (i-nums[i]);  // 3 = 3 + (0-3)
            // 7 = 7 +(1-0)
            // 8 = 8 +(2-1)
            // 9
        }
return res;
    }
}
