package Apnacollege.backtrack;

public class sudoku {
    public static boolean isSafe(int sudoku[][],int row, int col,int digit){
        // column
        for(int i =0; i<9;i++){
           if(sudoku[row][i]== digit){
            return false;
           } 
        }

        // row 
        for(int j =0;j<9;j++){
            if(sudoku[j][col] == digit){
                return false;
            }
        }
        // grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;

        //3X3 grid check
        for(int i =sr; i<sr+3;i++){
            for(int j =sc; j<sc+3;j++){
                if(sudoku[i][j]==digit){
                 return false;
                }
               
            }
        }

        return true;
    }
    public static boolean sudokuSolver(int sudoku[][], int row,int col){
     
        //base case
        // last row =8 so after the row =8 it will incremented by  one then row = 9 and col =0 
        // because to iterate the next col
        if(row == 9){
            return true;
        }
      
       

        //recursion
        // increase the col for every recursion
        int nextRow = row, nextCol = col+1;
        // if col is reached to the end of the col then row will be incremented
        if(col+1 == 9){
            nextRow = row+1;
            nextCol = 0;
        }

        // the value is not 0 then we need not place the value
        if(sudoku[row][col] !=0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for(int digit =1; digit<=9;digit++){
if(isSafe(sudoku,row,col,digit)){
    sudoku[row][col] = digit;
    if(sudokuSolver(sudoku, nextRow, nextCol)){ // if it returned true then solution is existed
        return true;
    }
    // if don't return true then
    sudoku[row][col] = 0;

}
        }
       
        return false;
    }
public static void printSolution(int sudoku[][]){
    for(int i =0 ;i<sudoku.length;i++){
        for(int j =0; j<sudoku.length;j++){
            System.out.print(sudoku[i][j]+" ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        int sudoku[][] = { {0, 0, 8, 0, 0, 0, 0, 0, 0}, 
         {4, 9, 0, 1, 5, 7, 0, 0, 2}, 
         {0, 0, 3, 0, 0, 4, 1, 9, 0}, 
         {1, 8, 5, 0, 6, 0, 0, 2, 0}, 
         {0, 0, 0, 0, 2, 0, 0, 6, 0}, 
         {9, 6, 0, 4, 0, 5, 3, 0, 0}, 
         {0, 3, 0, 0, 7, 2, 0, 0, 4}, 
         {0, 4, 9, 0, 3, 0, 0, 5, 7}, 
         {8, 2, 7, 0, 0, 9, 0, 1, 3} };

         if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("SOlution Exist");
            printSolution(sudoku);
         }
         else{
            System.out.println("SOlution Not Exist");
          
         }
    }
}
