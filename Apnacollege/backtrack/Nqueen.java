package Apnacollege.backtrack;

public class Nqueen {

    public static boolean isSafe(char board[][], int row , int col){
// up
for(int i =row-1;i>=0;i--){
if(board[i][col]=='Q'){
    return false;
}
}

// up left diagonal
for(int i =row-1, j =col-1; j>=0&& i>=0; j--,i--){
   if(board[i][j]=='Q'){
    return false;
   } 
}


// up right diagonal
for(int i =row-1, j =col+1; j<board[0].length&& i>=0; j++,i--){
    if(board[i][j]=='Q'){
     return false;
    } 
 }

 return true;
    }

public static void nqueen(char board[][],int row){
    if(row == board.length){
       
printvalues(board);
count++;
        return;
    }

    for(int j =0; j<board.length;j++){
   if(isSafe(board, row, j)){
        board[row][j] = 'Q';
        nqueen(board,row+1);
        board[row][j] ='X';
   }
    }
}
    
public static void printvalues(char board[][]){
    System.out.println("-----  check board -----");
    for(int i =0;i<board.length;i++){
        for(int j =0; j<board.length;j++){
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }
}

static int count =0;
public static void main(String[] args) {
    int n = 5;
    char board[][] = new char[n][n];
    //initialize
    for(int i=0; i<n;i++){
        for(int j =0; j<n;j++){
            board[i][j] = 'X';
        }
    }
nqueen(board, 0);
System.out.println(count);
// -----  check board -----
// Q . 
// Q . 
// -----  check board -----
// Q . 
// . Q 
// -----  check board -----
// . Q 
// Q . 
// -----  check board -----
// . Q 
// . Q 


// -----  check board -----
// Q X X X X 
// X X Q X X 
// X X X X Q 
// X Q X X X 
// X X X Q X 
// -----  check board -----
// Q X X X X 
// X X X Q X 
// X Q X X X 
// X X X X Q 
// X X Q X X 
// -----  check board -----
// X Q X X X 
// X X X Q X 
// Q X X X X 
// X X Q X X 
// X X X X Q 
// -----  check board -----
// X Q X X X 
// X X X X Q 
// X X Q X X 
// Q X X X X 
// X X X Q X 
// -----  check board -----
// X X Q X X 
// Q X X X X 
// X X X Q X 
// X Q X X X 
// X X X X Q 
// -----  check board -----
// X X Q X X 
// X X X X Q 
// X Q X X X 
// X X X Q X 
// Q X X X X 
// -----  check board -----
// X X X Q X 
// Q X X X X 
// X X Q X X 
// X X X X Q 
// X Q X X X 
// -----  check board -----
// X X X Q X 
// X Q X X X 
// X X X X Q 
// X X Q X X 
// Q X X X X 
// -----  check board -----
// X X X X Q 
// X Q X X X 
// X X X Q X 
// Q X X X X 
// X X Q X X 
// -----  check board -----
// X X X X Q 
// X X Q X X 
// Q X X X X 
// X X X Q X 
// X Q X X X 
}
}


