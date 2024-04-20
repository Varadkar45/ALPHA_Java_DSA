/*N-Queens - count ways
Count total number of ways in which we can solve N Queens problem.*/
public class nqueencountways {
    public static boolean isSafe(char board[][], int row, int col) {
        //vertical up
        for(int i = row-1; i>=0; i--) {
            if(board[i][col]=='Q') {
                return false;
            }
        }
        //diag left up
        for(int i = row-1, j = col-1; i>=0 && j>=0; i--, j--) {
            if(board[i][j]=='Q') {
                return false;
            }
        }
        //diag right
        for(int i = row-1, j = col+1; i>=0 && j<board.length; i--, j++) {
            if(board[i][j]=='Q') {
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char board[][], int row) {
        //base
        if(row==board.length) {
            //printBoard(board);
            count++;
            return;
        }
        //column loop
        for(int j=0; j<board.length; j++) {
            if(isSafe(board, row, j)) {
            //placing queen
            board[row][j]='Q';
            //calling next row
            nQueens(board, row+1);//function call
            board[row][j] = 'x';//backtracking step
            }
        }   
    }
    static int count = 0;
    //print board
    public static void printBoard(char board[][]) {
        System.out.println("----Chess Board----");
        for(int i = 0; i<board.length; i++) {
            for(int j = 0; j<board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        //intialize
        for(int i = 0;  i<n; i++) {
            for(int j = 0; j<n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
        System.out.println("Total number of ways to place queens is "+count);
    }
}
