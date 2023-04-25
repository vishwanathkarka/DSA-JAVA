package leetcode;

public class CountNegNum {
    public static void main(String[] args) {
        int arr[][] ={{5,1,0},{-5,-5,-5}};
        System.out.println(countNegatives(arr));
    }
    public static int countNegatives(int[][] grid) {
        int row =0;
        int countNegative =0;
        while(row<grid.length)
        {
            int high = grid[0].length -1;
            int low = 0;
            while(low<=high)
            {
                int mid =  (low +high)/2;
                // if positive value is found in mid move the low to the mid+1 to find the first negative number
                if(grid[row][mid]>=0)
                {
                    low = mid+1;
                }
                // opposite to above
                else if(grid[row][mid]<0)
                {
                    high = mid-1;
                }

            }
            countNegative += ((grid[0].length-1) - high);
            System.out.println("-----"+high);
            // increase the row
            row++;
        }
        return countNegative;
    }
}
