public class SearchInsertPostion {
    public static void main(String[] args) {
        int arr [] = {1,3,5,6};
        int target = 5;
        int res = searchInsert(arr,target);
        System.out.println(res);
    }
    static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length;
        while(low < high) {
            int mid = low + (high - low)/2;
            if(target > nums[mid])
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}
