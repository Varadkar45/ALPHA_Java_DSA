/*n queen without considering attacks*/ 
public class nqueenswohit {
    public static void nQueens(char board[][], int row) {
        //base
        if(row==board.length) {
            printBoard(board);
            return;
        }
        //column loop
        for(int j=0; j<board.length; j++) {
            //placing queen
            board[row][j]='Q';
            //calling next row
            nQueens(board, row+1);//function call
            board[row][j] = 'x';//backtracking step
        }
        
    }
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
        int n = 2;
        char board[][] = new char[n][n];
        //intialize
        for(int i = 0;  i<n; i++) {
            for(int j = 0; j<n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
    }    
}
