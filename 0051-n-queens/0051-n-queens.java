class Solution {
    public void nQueens(int col,char[][] board,int[] leftcol,int[] leftUpDiagonal,int[] leftDownDiagonal,int n,List<List<String>> res){
        if(col == n){
            res.add(changed(board));
            return;
        }
        for(int row = 0;row < n;row++){
            if(leftcol[row] == 0 && leftUpDiagonal[n - 1 + col - row] == 0 && leftDownDiagonal[row + col] == 0){
                board[row][col] = 'Q';
                leftcol[row] = 1;
                leftUpDiagonal[n - 1 + col - row] = 1;
                leftDownDiagonal[row + col] = 1;
                nQueens(col + 1,board,leftcol,leftUpDiagonal,leftDownDiagonal,n,res);
                board[row][col] = '.';
                leftcol[row] = 0;
                leftUpDiagonal[n - 1 + col - row] = 0;
                leftDownDiagonal[row + col] = 0;
            }
        }
    }
    public List<String> changed(char[][] board){
        List<String> temp = new ArrayList<>();
        for(char[] row : board){
            temp.add(new String(row));
        }
        return temp;
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] c : board){
            Arrays.fill(c,'.');
        }
        int[] leftcol = new int[n];
        int[] leftUpDiagonal = new int[2 * n - 1];
        int[] leftDownDiagonal = new int[2 * n - 1];
        nQueens(0,board,leftcol,leftUpDiagonal,leftDownDiagonal,n,res);
        return res;
    }
}