class Solution {
    public int count = 0;
    public void nQueens(int col,char[][] board,int[] leftcol,int[] leftUpDiagonal,int[] leftDownDiagonal,int n){
        if(col == n){
            count++;
            return;
        }
        for(int row = 0;row < n;row++){
            if(leftcol[row] == 0 && leftUpDiagonal[n - 1 + col - row] == 0 && leftDownDiagonal[row + col] == 0){
                board[row][col] = 'Q';
                leftcol[row] = 1;
                leftUpDiagonal[n - 1 + col - row] = 1;
                leftDownDiagonal[row + col] = 1;
                nQueens(col + 1,board,leftcol,leftUpDiagonal,leftDownDiagonal,n);
                board[row][col] = '.';
                leftcol[row] = 0;
                leftUpDiagonal[n - 1 + col - row] = 0;
                leftDownDiagonal[row + col] = 0;
            }
        }
    }
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(char[] c : board){
            Arrays.fill(c,'.');
        }
        int[] leftcol = new int[n];
        int[] leftUpDiagonal = new int[2 * n - 1];
        int[] leftDownDiagonal = new int[2 * n - 1];
        nQueens(0,board,leftcol,leftUpDiagonal,leftDownDiagonal,n);
        return count;
    }
}