package Apnacollege;

public class twodarray {
    public static void spiralMatrix(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow<= endRow && startCol<=endCol){
            //start 
            for(int i =startCol; i<=endCol; i++){
                System.out.print(matrix[startCol][i]+" ");
            }
            //right
            for(int j = startRow+1; j<=endRow;j++){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[j][endRow]+" ");
            }
            //bottom 
            for(int i = endCol-1;i>=startCol; i--){ 
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[endRow][i]+" ");
            }
            //left
            for(int j = endCol-1;j>startRow;j--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[j][startCol]+" ");
            }
            startCol++;
            startRow ++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void diagonalSum(int matrix[][]){
        int sum =0;
for(int i =0; i<matrix.length;i++){
    for(int j =0; j <matrix[0].length; j++){
        if(i==j){
            sum+= matrix[i][j];
        }
        if(i+j==matrix.length-1){
            sum+= matrix[i][j];
        }
    }
}
    }
    public static void main(String[] args){
// int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
int arr[][] = {{1,2,3,4},{5,6,7,8}};
spiralMatrix(arr);
    }
}
