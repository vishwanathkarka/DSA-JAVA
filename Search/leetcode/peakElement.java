package leetcode;

public class peakElement {
    public static void main(String[] args) {
        int[] arr =  {2,3,1,4,5,6,2};
        System.out.println(findPeakElement(arr));
    }

        static int findPeakElement(int[] nums) {
            int start=0;
            int end=nums.length-1;
            while(start<end)
            {
                int mid=start+(end-start)/2;
                if(nums[mid]<nums[mid+1])
                {
                    start=mid;
                }
                else{
                    end=mid;
                }

            }
            return nums[start];


    }
}
