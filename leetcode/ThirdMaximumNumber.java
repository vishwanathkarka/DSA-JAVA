public class ThirdMaximumNumber {
    public static void main(String[] args) {
//        Input: nums = [3,2,1]
//        Output: 1
//        Input: nums = [1,2]
//        Output: 2




    }

    static int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for(Integer val:nums){
            if(val.equals(max1)|| val.equals(max2)|| val.equals(max3)) continue;
            if(max1 == null||val>max1){
                max3 = max2;
                max2 = max1;
                max1 = val;
            }
            else if(max2 == null ||val>max2){
                max3 = max2;
                max2 = val;
            }
            else if (max3 == null || val>max3){
                max3 = val;
            }
        }
        return (max3 == null?max1:max3);
    }

}
