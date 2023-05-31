public class setMatrixZero {
    
    // https://leetcode.com/problems/set-matrix-zeroes/

    //checking the array and placing values at first row and first col
        public static void setZeroes(int[][] matrix) {
            int index0=1;
         for(int i =0; i<matrix.length;i++){
             for(int j=0; j<matrix[0].length;j++){
                 if(matrix[i][j]==0){
                     matrix[i][0] =0;
                     if(j!=0){
                         matrix[0][j] = 0;
                     }
                     else{
                         index0 =0;
                     }
                 }
             }
    
         }
  
    // --------|
    //| =>
    //| =>
    //| =>
// we are skiping the first row and first col value 
             for(int i =1; i<matrix.length;i++){
                 for(int j =1; j<matrix[0].length;j++){
    if(matrix[i][j] !=0){
        if(matrix[0][j]==0 || matrix[i][0]==0){
            matrix[i][j]=0;
        
    }
                 }
             }
         }
    
         // this is for changing the values of the first col 00 , 01, 02,03
         if(matrix[0][0]==0){
             for(int i =0; i<matrix[0].length;i++){
                 matrix[0][i] =0;
             }
         }  
     // this if for the 00 row values changing 
         if(index0 == 0){
             for(int j =0; j<matrix.length;j++){
                 matrix[j][0] =0;
             }
         } 
    
    
    
        }
         
        public static void printmatrix(int[][] matrix){
            for(int i =0; i<matrix.length;i++){
                for(int j=0; j<matrix[0].length;j++){
                    System.out.print(matrix[i][j]);
                }
       System.out.println();
            }
        }
       public static void main(String[] args) {
        int arr[][] = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(arr);
        printmatrix(arr);
        
// 101
// 000
// 101
       } 
    
}
