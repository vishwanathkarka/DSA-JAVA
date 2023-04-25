package leetcode;

public class CountNegitive {
static  void Nums(int grid[][]){
    int count =0;
    for(int i =0; i<grid.length;i++){
        int low =0;
        int high =grid[i].length;



        while(low<high){
            if(grid[i][0] < 0){
                count = count + grid[i].length+1;
break;
            }

            int mid = low+(high-low)/2;

            if(grid[i][mid]<0){
                high = mid-1;

            }
            else{
                low = mid+1;
            }

        }

        System.out.println("high"+high);
        count = count+ (grid[i].length-1)-high;
        System.out.println(count);
    }


}
    public static void main(String[] args) {
    int arr[][] ={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
Nums(arr);
    }
}
