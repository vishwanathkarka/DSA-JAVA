import java.util.Arrays;


public class MergeSortedArray {
//    https://leetcode.com/problems/merge-sorted-array/
//    Input: nums1 = [1,2,3,0,0,0] it has the space for nums2, m = 3, nums2 = [2,5,6], n = 3
//    Output: [1,2,2,3,5,6]
public static void main(String[] args) {
    int nums1[] = {1,2,3,0,0,0}; // merging the arrays and sorting and the temp value shuld not take
    int nums2[] = {2,5,6};
    merge(nums1,3,nums2,3);
}

   static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j =n-1;
        int size = nums1.length-1; // length of the nums1
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){  // taking the two pointer for the sorting
                // every array is in the sorted order so we are checking the last value of two array then lagest is placed at the last
                nums1[size] = nums1[i];
                i--; // decreaing the i value
                // if we decrese the index so the other value can placed at that place
                size--; // decereaseing the index of the final arr becase last value is sorted
            }
            else{ // j value base case is checked at the while // if two value are 2 and 2 it will move to else
                // i value always high only  j value we need to check
                nums1[size] = nums2[j];
                j--;
                size--;
            }
        }
       System.out.println(Arrays.toString(nums1));
    }
}

//{1,2,3,0,0,0}  {2,5,6}; 6>3  => {1,2,3,0,0,6} i-- 2 && size --
// {1,2,3,0,0,6} {2,5} 3>2 => {1,2,3,0,5,6} j-- 2 && size
// {1,2,3,0,5,6} {2,5,6} 3>2  => {1,2,3,3,5,6}  i-- 1 && size--
// {1,2,3,3,5,6} {2,5,6} else =>{1,2,2,3,5,6} j--
